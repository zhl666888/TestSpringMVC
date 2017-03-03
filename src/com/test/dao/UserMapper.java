package com.test.dao;

import com.test.entity.User;


public interface UserMapper {
    public int deleteByPrimaryKey(Integer id);

    public int insert(User record);

    public int insertSelective(User record);

    public User selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(User record);

    public int updateByPrimaryKey(User record);
    public User selectUserIdByUser(User user);
    
    public int getUserIsExist(User record);
}