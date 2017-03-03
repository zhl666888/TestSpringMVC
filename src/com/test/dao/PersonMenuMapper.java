package com.test.dao;

import java.util.List;

import com.test.entity.PersonMenu;

public interface PersonMenuMapper {
    int deleteByPrimaryKey(String id);

    int insert(PersonMenu record);

    int insertSelective(PersonMenu record);

    PersonMenu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PersonMenu record);

    int updateByPrimaryKey(PersonMenu record);
    
    List<PersonMenu> getMenuList();
}