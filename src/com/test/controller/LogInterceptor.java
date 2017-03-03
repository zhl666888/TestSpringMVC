package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LogInterceptor  implements HandlerInterceptor  {
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}
	/*
	 * 登录验证
	 * 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		String a=request.getParameter("username");
		if(request.getSession().getAttribute("userName")!=null){
			
			return true;
		} else if(request.getServletPath()=="/login"){
			System.out.println(request.getServletPath());
			return true;
		} else if(a!=null&&a!=""){
			return true;
		}else if(request.getServletPath()=="/login/shop"){
			if(request.getSession().getAttribute("userName")!=null){
				return true;
			}else{
				response.sendRedirect(request.getContextPath() +"/login");
				return false;
			}
		}
		else{
			response.sendRedirect(request.getContextPath() +"/login");
            return false;
		}

	}

}
