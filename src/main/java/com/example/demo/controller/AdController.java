package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ads;
import com.example.demo.service.AdService;

@RestController
@RequestMapping("/ads")
public class AdController {
	@Autowired
	AdService adService;
	
	@RequestMapping("/increase")
	public List<Ads> getList(){
		
		
		return adService.getAdList();
	}
}
