package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.AdRmMapper;
import com.example.demo.model.AdRem;
import com.example.demo.service.AdRmService;

@Service
public class AdRmServiceimpl implements AdRmService{
	@Autowired
	AdRmMapper adReMapper;

	@Override
	public int removeAd(AdRem remove) {
		// TODO Auto-generated method stub
		AdRem ad  = adReMapper.selectAdByname(remove.getName());
		int i=-1;
		if (ad==null) {
			i=2;
			i=i+1;
		}else {
			i=adReMapper.removeAds(remove);
		}
		
		return i;
	}

}
