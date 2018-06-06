package com.xlx.entity;

import java.util.List;

public class RolePermission {
	private Long user_permission_id;
	private Long role_id;
	private Long permission_id;
	private List<Role> role;
	private List<Permission> permission;
	public Long getUser_permission_id() {
		return user_permission_id;
	}
	public void setUser_permission_id(Long user_permission_id) {
		this.user_permission_id = user_permission_id;
	}
	public Long getRole_id() {
		return role_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	public Long getPermission_id() {
		return permission_id;
	}
	public void setPermission_id(Long permission_id) {
		this.permission_id = permission_id;
	}
	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	public List<Permission> getPermission() {
		return permission;
	}
	public void setPermission(List<Permission> permission) {
		this.permission = permission;
	}
	public RolePermission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RolePermission(Long user_permission_id, Long role_id,
			Long permission_id, List<Role> role, List<Permission> permission) {
		super();
		this.user_permission_id = user_permission_id;
		this.role_id = role_id;
		this.permission_id = permission_id;
		this.role = role;
		this.permission = permission;
	}
	@Override
	public String toString() {
		return "RolePermission [user_permission_id=" + user_permission_id
				+ ", role_id=" + role_id + ", permission_id=" + permission_id
				+ ", role=" + role + ", permission=" + permission + "]";
	}
	
}
