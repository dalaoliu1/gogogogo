package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.AdAdds;

@Mapper
public interface AdAddsMapper {
	public AdAdds selectAdByName(String name);
	public int insertAds(AdAdds ad);
}
