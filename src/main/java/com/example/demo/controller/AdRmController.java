package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AdRem;
import com.example.demo.service.AdRmService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/ads")
public class AdRmController {
	@Autowired
	AdRmService adRmService;
	@RequestMapping("/adsremove")
	public JSONObject adRemove(@RequestBody AdRem remove) {
		JSONObject returnss = new JSONObject();
		//调用service层
		int i =adRmService.removeAd(remove);
		returnss.put("state", i);
		return returnss;
	}
}
