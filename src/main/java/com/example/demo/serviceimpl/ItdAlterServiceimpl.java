package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ItdAlterMapper;
import com.example.demo.model.SysAlter;
import com.example.demo.service.ItdAlterService;

@Service
public class ItdAlterServiceimpl implements ItdAlterService {
	@Autowired
	ItdAlterMapper itdAlterMapper;

	@Override
	public int update(SysAlter sysalter) {
		// TODO Auto-generated method stub
		//调用mapper层实现个人信息修改
		SysAlter u4= itdAlterMapper.selectItdAlterByName(sysalter.getName());
		int i=0;
		if (u4==null) {
			i=1;
		}else {
			i=itdAlterMapper.updateIntroduce(sysalter);
			i=i+1;
		}
		
		return i;
	
	}
	

}
