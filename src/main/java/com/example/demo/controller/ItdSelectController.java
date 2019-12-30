package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SysItdSelect;
import com.example.demo.service.ItdSelectService;
//实现个人信息的查询的Controller

@RestController
@RequestMapping("/introduce")
public class ItdSelectController {
	@Autowired
	ItdSelectService itdselectService;
	
	@RequestMapping("/look")
	public List<SysItdSelect> getList(){
		return itdselectService.getpersonalList();
	}
		
	}
	
	


