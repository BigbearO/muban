package com.xhf.mymail.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xhf.mymail.entity.User;

@Repository
public interface UserMapper {
    @Select("select count(*) from users where user_name=#{name} and user_pass=#{pass}")
	int findUserByNameAndPwd(@Param("name") String name,@Param("pass") String pass);
    
    @Insert("insert into users(user_id,user_name,user_pass,user_phone,user_address) values(default,#{name},#{pass},#{phone},#{address})") 
    int insert(User user);
    
    
    @Select("select count(*) from users where user_name=#{name}")
    int findUserByName(@Param("name") String name);
}
