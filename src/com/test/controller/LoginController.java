package com.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.entity.PersonMenu;
import com.test.entity.User;
import com.test.service.IUserService;
import com.test.service.PersonMenuService;

@Controller
@RequestMapping(value="login")
public class LoginController {
	@Autowired
	private IUserService userService;
	@Autowired
	private PersonMenuService personMenuService;
	@RequestMapping(value="")
	public String login(Model model,HttpServletRequest request){
		request.getSession().removeAttribute("userName");
		return "login";
	}
	@RequestMapping(value="shop")
	public String viewE(User user,Model model,HttpServletRequest request){
		String userName=	request.getParameter("username");
		String password=request.getParameter("password");
		user.setUserName(userName);
		user.setPassword(password);
		Boolean isRight=   userService.getUserIsExist(user);
		if(isRight){
			request.getSession().setAttribute("userName", "1");
		}
		List<PersonMenu> menuList=personMenuService.getMenuList();
		model.addAttribute("personMenu", menuList);
		return "viewShop";
	}
}
