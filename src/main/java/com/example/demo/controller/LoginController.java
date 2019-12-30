package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoginUsers;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/login")
//登录的Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/getMessage")
	public List<LoginUsers> getMessage(){
		return loginService.getUserMessage();
	}
}
