package com.xlx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xlx.entity.Role;
import com.xlx.entity.User;
import com.xlx.mapper.RoleMapper;
import com.xlx.service.RoleService;
@Service
public class RoleService{
	
	@Autowired
	private RoleMapper roleMapper;
	
	/**
	 * 查询所有角色信息
	 */
	public List<Role> FindRole(Role role) {
		List<Role> findAllRoleList = roleMapper.FindRole(role);
		return findAllRoleList;
	}
	/**
	 * 根据用户id查询用户角色信息

	 */
	public Role getRoleId(int role_id ) {
		return roleMapper.getRoleId(role_id);
	}
	/**
	 * 更改角色表信息
	 */
	public int roleUpdate(Role role) {
		return roleMapper.roleUpdate(role);
	}
	/**
	 *新增角色信息
	 */
	public int roleInsert(Role role) {
		return roleMapper.roleInsert(role);
	}
	/**
	 *删除角色信息
	 */
	 public  int roleDelete(int role_id){
		 return roleMapper.roleDelete(role_id);
	 };
}
