package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DiscussMapper;
import com.example.demo.model.Discuss;
import com.example.demo.service.DiscussService;

@Service
public class DiscussServiceimpl implements DiscussService {
	@Autowired
	DiscussMapper discussMapper;
	@Override
	public int communicate(Discuss dis) {
		// TODO Auto-generated method stub
		Discuss d0 =discussMapper.selectusername(dis.getContent());
		int i =-1;
		if (d0==null) {
			i=discussMapper.addcontent(dis);
		}else {
			i=2;
		}
		return i;
		
	}
	
	
	
}
