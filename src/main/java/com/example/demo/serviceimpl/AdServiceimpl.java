package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.AdMapper;
import com.example.demo.model.Ads;
import com.example.demo.service.AdService;

@Service
public class AdServiceimpl implements AdService{
	@Autowired
	AdMapper adMapper;
	
	@Override
	public List<Ads> getAdList() {
		// TODO Auto-generated method stub
		return adMapper.selectAllAds();
	}

}
