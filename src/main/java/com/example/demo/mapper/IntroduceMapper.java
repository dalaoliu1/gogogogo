package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.SysIntroduce;

@Mapper
public interface IntroduceMapper {
	public SysIntroduce selectIntroduceByName(String name);
	public int insertIntroduce(SysIntroduce introduce);

}
