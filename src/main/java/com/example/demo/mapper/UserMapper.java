package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.SysUser;

@Mapper
public interface UserMapper {
	public SysUser selectUserByUsername(String username);
	public int insertUser(SysUser user);

}
