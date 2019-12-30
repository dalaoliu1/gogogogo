package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Discuss;


@Mapper
public interface DiscussMapper {
	public Discuss selectusername(String content);
	public int addcontent(Discuss dis);
}
