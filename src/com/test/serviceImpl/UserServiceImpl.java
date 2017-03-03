package com.test.serviceImpl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.test.dao.UserMapper;
import com.test.entity.User;
import com.test.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private UserMapper userMapper;
	/**
	 * 根据用户ID查出用户信息
	 */
	@Override
	public User getUserById(int userId) {		
		return this.userMapper.selectByPrimaryKey(userId);
	}
	@Override
	public User getUserIdByUser(User user) {
		// TODO Auto-generated method stub
		return this.userMapper.selectUserIdByUser(user);
	}
	/*验证用户名是否正确*/
	@Override
	public Boolean getUserIsExist(User user) {
		 Integer ss=userMapper.getUserIsExist(user);
		 if(ss==1){
			 return true;
		 }else{
			 return false;
		 }
	}
}
