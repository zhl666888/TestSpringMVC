package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.entity.PersonMenu;
@Service
public interface PersonMenuService {
      public List<PersonMenu> getMenuList();
}
