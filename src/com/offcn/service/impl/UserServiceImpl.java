package com.offcn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.offcn.mapper.UserMapper;
import com.offcn.pojo.User;
import com.offcn.service.UserService;


/**
 * @author hyz
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	UserMapper userMapper;
	 
	@Override
	public User userlogin(User user) {
		return userMapper.userlogin(user);
	}

}
