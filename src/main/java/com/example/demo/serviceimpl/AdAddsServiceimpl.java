package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.AdAddsMapper;
import com.example.demo.model.AdAdds;
import com.example.demo.service.AdAddService;

@Service
public class AdAddsServiceimpl implements AdAddService{
	@Autowired
	AdAddsMapper adaddsmapper;
	@Override
	public int adadds(AdAdds ad) {
		// TODO Auto-generated method stub
		//调用mapper实现增加
		AdAdds as= adaddsmapper.selectAdByName(ad.getName());
		int i=-1;
		if (as==null) {
			i=adaddsmapper.insertAds(ad);
		}else {
			i=2;
		}
		
		return i;
	}
	
}
