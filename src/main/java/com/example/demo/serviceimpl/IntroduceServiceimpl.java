package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.IntroduceMapper;
import com.example.demo.model.SysIntroduce;
import com.example.demo.service.IntroduceService;

@Service
public class IntroduceServiceimpl  implements IntroduceService{
	@Autowired
	IntroduceMapper introduceMapper;

	@Override
	public int create(SysIntroduce introduce) {
		// TODO Auto-generated method stub
		//调用mapper实现增加个人介绍
		
		SysIntroduce u1= introduceMapper.selectIntroduceByName(introduce.getName());
		int i=0;
		if (u1==null) {
	      i=introduceMapper.insertIntroduce(introduce);
		}else {
			i=2;
		}
		
		return i;
	}
	

}
