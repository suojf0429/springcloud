package com.gk.dao;

import com.gk.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface LoginDao {
    @Select("SELECT id,username,password FROM s WHERE username=#{username} AND password=#{password}")
    Admin findAdmin(@Param("username") String username,@Param("password") String password);
}
