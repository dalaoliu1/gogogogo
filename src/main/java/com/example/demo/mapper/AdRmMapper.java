package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.AdRem;

@Mapper
public interface AdRmMapper {
	public AdRem selectAdByname(String name);
	public int removeAds(AdRem remove);
}
