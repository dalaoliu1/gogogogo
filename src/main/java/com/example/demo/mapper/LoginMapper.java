package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.LoginUsers;


@Mapper
public interface LoginMapper {
	public List<LoginUsers> selectAllSysUsers();
}
