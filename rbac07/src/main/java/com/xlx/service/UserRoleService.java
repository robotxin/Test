package com.xlx.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xlx.entity.UserRole;
import com.xlx.mapper.UserRoleMapper;
import com.xlx.service.UserRoleService;

@Service
public class UserRoleService{
	
	@Autowired
	private UserRoleMapper userRoleMapper;
	
	public int UserRoleInsert(UserRole userRole) {
		return userRoleMapper.UserRoleInsert(userRole);
	}
	public int UserRoleInsertto(UserRole userRole) {
		return userRoleMapper.UserRoleInsert(userRole);
	}

	public int UserRoleDelete(int user_id) {
		return userRoleMapper.UserRoleDelete(user_id);
	}
	public int UserRoleDeleteTo(int user_role_id){
		return userRoleMapper.UserRoleDeleteTo(user_role_id);
	};
	public int UserRoleUpdate(UserRole userRole) {
		return userRoleMapper.UserRoleUpdate(userRole);
	}
	public List<UserRole> UserRoleSelect(UserRole userRole) {
		List<UserRole> userRoleSelect = userRoleMapper.UserRoleSelect(userRole);
		return userRoleSelect;
	}
	/**
	 * 根据用户id查询角色信息

	 */
	public UserRole getUserRoleId(int user_id ) {
		return userRoleMapper.getUserRoleId(user_id);
	}

	public List<UserRole> FindAll(UserRole userRole) {
		List<UserRole> findAllUserRole = userRoleMapper.FindAll(userRole);
		return findAllUserRole;
	}

}
