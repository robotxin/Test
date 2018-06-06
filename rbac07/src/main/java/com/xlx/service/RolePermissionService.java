package com.xlx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xlx.entity.RolePermission;
import com.xlx.mapper.RolePermissionMapper;

@Service
public class RolePermissionService {
	@Autowired
	private RolePermissionMapper rolePermissionMapper;
	
	public int RolePermissionInsert(RolePermission rolePermission){
		return rolePermissionMapper.RolePermissionInsert(rolePermission);
	};
	public int RolePermissionDelete(int user_permission_id){
		return rolePermissionMapper.RolePermissionDelete(user_permission_id);
	};
	public int RolePermissionUpdate(RolePermission rolePermission){
		return rolePermissionMapper.RolePermissionUpdate(rolePermission);
	};
    public List<RolePermission> RolePermissionSelect(RolePermission rolePermission){
    	return rolePermissionMapper.RolePermissionSelect(rolePermission);
    };
}
