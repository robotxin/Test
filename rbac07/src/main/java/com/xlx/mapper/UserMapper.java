package com.xlx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xlx.entity.User;
/**
 * 
public List<Userinfo> Finduser(Userinfo userinfo);
 */

@Mapper
public interface UserMapper {
	public int userinsert(User user);
	public  int userdelete(int user_id);
	public int userupdate(User user);
	public User getid(int user_id);
    public List<User> Finduser(User user);
    public List<User> FindUserRole(User user);
    public List<User> FindAllUserRole(User user);
}
