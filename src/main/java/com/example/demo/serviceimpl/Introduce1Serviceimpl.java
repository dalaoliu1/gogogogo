package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.Introduce1Mapper;
import com.example.demo.model.SysIntroduce1;
import com.example.demo.service.Introduce1Service;

@Service
public class Introduce1Serviceimpl  implements Introduce1Service{
	
	@Autowired
	Introduce1Mapper introduce1Mapper;

	@Override
	public int delete(SysIntroduce1 introduce1) {
		// TODO Auto-generated method stub
		//调用mapper实现删除个人介绍
		SysIntroduce1 u2= introduce1Mapper.selectIntroduceByUID(introduce1.getuID());
		int i=0;
		if (u2==null) {
			i=1;
		}else {
			i=introduce1Mapper.deleteIntroduce(introduce1);
			i=i+1;
		}
		
		return i;
	}
	
	
	}

