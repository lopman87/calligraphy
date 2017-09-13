package com.shufa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.shufa.dbModel.AdminUserDTO;

@Mapper
public interface AdminUserMapper {
	@Select("SELECT adminName,adminPwd  FROM adminUser WHERE adminName = #{adminName}")
	List<AdminUserDTO> findByName(@Param("adminName") String name);

	
	
	@Insert("INSERT INTO adminUser(adminName, adminPwd) VALUES(#{adminName}, #{adminPwd})")
	int insert(@Param("adminName") String name, @Param("adminPwd") String age);

}
