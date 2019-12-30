package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.SysIntroduce1;
import com.example.demo.service.Introduce1Service;

import net.sf.json.JSONObject;
//实现个人信息的删除Controller
@RestController
@RequestMapping("/introduce")
public class Introduce1Controller {
	@Autowired
	Introduce1Service introduce1Service;
	
	@RequestMapping("/delete")
	public JSONObject delete(@RequestBody SysIntroduce1 introduce1) {
		JSONObject result=new JSONObject();
		//调用Service层
		
		
		int i =introduce1Service.delete(introduce1);
	    result.put("state",i);
		return result;
	}
}
