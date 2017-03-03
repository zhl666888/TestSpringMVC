package com.test.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.dao.PersonMenuMapper;
import com.test.entity.PersonMenu;
import com.test.service.PersonMenuService;
@Service("personMenuService")
public class PersonMenuServiceImpl implements PersonMenuService{
	@Resource
	private PersonMenuMapper personMenuMapper;
	@Override
	public List<PersonMenu> getMenuList() {
		List<PersonMenu> menuList=personMenuMapper.getMenuList();
		return menuList;
	}

}
