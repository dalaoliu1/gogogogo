package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Discuss;
import com.example.demo.service.DiscussService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
//评论的Controller
public class DiscussController {
	@Autowired
	DiscussService discussService;
	
	@RequestMapping("/communicate")
	public JSONObject communicate(@RequestBody Discuss dis) {
		JSONObject result=new JSONObject();
		
		int i = discussService.communicate(dis);
		result.put("state",i);
		return result;
	}
}
