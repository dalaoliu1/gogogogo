package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.SysIntroduce1;

@Mapper
public interface Introduce1Mapper {
	public SysIntroduce1 selectIntroduceByUID(int uID);
	public int deleteIntroduce(SysIntroduce1 introduce1);


}
