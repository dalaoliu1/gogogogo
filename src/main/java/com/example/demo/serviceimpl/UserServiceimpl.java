package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.SysUser;
import com.example.demo.service.UserService;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    UserMapper userMapper;
	@Override
	public int register(SysUser user) {
		// TODO Auto-generated method stub
		//调用mapper实现注册
		SysUser u0= userMapper.selectUserByUsername(user.getUsername());
		int i =-1;
		if (u0==null) {
			i=userMapper.insertUser(user);
		}else {
			i=2;
		}
		
		return i;
	}
	
	

}
