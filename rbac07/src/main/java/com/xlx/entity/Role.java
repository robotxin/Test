package com.xlx.entity;

import java.util.List;

public class Role {
	private Long role_id;
	private String role_name;
	//private List<User> user;
	private List<Role> role;
	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	public Long getRole_id() {
		return role_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	@Override
	public String toString() {
		return role_name ;
	}
	
	
}
