package com.xlx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xlx.entity.Permission;
import com.xlx.entity.Role;
import com.xlx.mapper.PermissionMapper;
import com.xlx.service.PermissionService;

@Service
public class PermissionService {
	
	@Autowired
	private PermissionMapper permissionMapper;
	
	/**
	 * 查询所有角色信息
	 */
	public List<Permission> FindAllPermission(Permission permission) {
		List<Permission> findAllPermissionList = permissionMapper.FindPermission(permission);
		return findAllPermissionList;
	}
	/**
	 * 根据用户id查询用户角色信息

	 */
	public Permission getPermissionId(int permission_id ) {
		return permissionMapper.getPermissionId(permission_id);
	}
	/**
	 * 更改角色表信息
	 */
	public int permissionUpdate(Permission permission) {
		return permissionMapper.permissionUpdate(permission);
	}
	/**
	 *新增角色信息
	 */
	public int permissionInsert(Permission permission) {
		return permissionMapper.permissionInsert(permission);
	}
	/**
	 *删除角色信息
	 */
	 public  int permissionDelete(int permission_id){
		 return permissionMapper.permissionDelete(permission_id);
	 };
}
