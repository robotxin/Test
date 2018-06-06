package com.xlx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xlx.entity.Permission;
import com.xlx.entity.Role;
import com.xlx.entity.User;
@Mapper
public interface LoginMapper {
	public List<User> Finduser(User user);
	public List<Role> FindUserRole(User user);
	public List<Permission> FindAllUserRole(User user);
	public long GetId(User user);
	//public List<User> FindByUserAccount(String user_account);
	public List<User> GetByUserNameAndPassord(@Param("user_account")String user_account,@Param("password")String password);
}
