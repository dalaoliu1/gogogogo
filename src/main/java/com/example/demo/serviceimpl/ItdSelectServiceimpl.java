package com.example.demo.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ItdSelectMapper;
import com.example.demo.model.SysItdSelect;
import com.example.demo.service.ItdSelectService;
@Service
public class ItdSelectServiceimpl implements ItdSelectService{
	@Autowired
	ItdSelectMapper itdselectMapper;

	@Override
	public List<SysItdSelect> getpersonalList() {
		// TODO Auto-generated method stub
		//调用mapper层实现个人信息删除
		return itdselectMapper.selectAllItdSelect();
	}

}
