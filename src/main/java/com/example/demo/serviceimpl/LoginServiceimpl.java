package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.LoginMapper;
import com.example.demo.model.LoginUsers;
import com.example.demo.service.LoginService;

@Service
public class LoginServiceimpl implements LoginService {

	@Autowired
	LoginMapper loginMapper;
	
	@Override
	public List<LoginUsers> getUserMessage() {
		// TODO Auto-generated method stub
		return loginMapper.selectAllSysUsers();
	}

}
