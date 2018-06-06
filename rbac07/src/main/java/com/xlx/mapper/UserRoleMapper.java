package com.xlx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xlx.entity.UserRole;
@Mapper
public interface UserRoleMapper {
	public int UserRoleInsert(UserRole userRole);
	public int UserRoleDelete(int user_id);
	public int UserRoleDeleteTo(int user_role_id);
	public int UserRoleUpdate(UserRole userRole);
	public List<UserRole> UserRoleSelect(UserRole userRole);
    public List<UserRole> FindAll(UserRole userRole);
    public UserRole getUserRoleId(int user_id);
}
