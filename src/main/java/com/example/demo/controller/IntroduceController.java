package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SysIntroduce;
import com.example.demo.service.IntroduceService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/introduce")
//实现个人信息的增加的Controller
public class IntroduceController {
	@Autowired
	IntroduceService introduceService;
	
	@RequestMapping("/create")
	public JSONObject create(@RequestBody SysIntroduce introduce) {
		JSONObject result=new JSONObject();
		//调用Service层
		
		
		int i =introduceService.create(introduce);
	    result.put("state",i);
		return result;
	}
}
