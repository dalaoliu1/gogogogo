package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.SysAlter;
import com.example.demo.service.ItdAlterService;

import net.sf.json.JSONObject;


@RestController
@RequestMapping("/introduce")
public class ItdAlterController {
	//实现个人信息修改的Controller
    @Autowired
    ItdAlterService itdalterService;
    
    @RequestMapping("/update")
    public JSONObject create(@RequestBody SysAlter sysalter) {
		JSONObject result=new JSONObject();
		//调用Service层
		
		
		int i =itdalterService.update(sysalter);
	    result.put("state",i);
		return result;
	
	
    }
}
