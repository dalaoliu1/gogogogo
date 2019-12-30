package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.SysAlter;

@Mapper
public interface ItdAlterMapper {

	public SysAlter selectItdAlterByName(String name);

	public int updateIntroduce(SysAlter sysalter);

}
