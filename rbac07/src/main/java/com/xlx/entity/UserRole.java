package com.xlx.entity;

import java.util.List;

public class UserRole {
	private Long user_role_id;
	private Long user_id;
	private Long role_id;
	private List<Role> role;
	private List<User> user;
	public Long getUser_role_id() {
		return user_role_id;
	}
	public void setUser_role_id(Long user_role_id) {
		this.user_role_id = user_role_id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getRole_id() {
		return role_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRole(Long user_role_id, Long user_id, Long role_id,
			List<Role> role, List<User> user) {
		super();
		this.user_role_id = user_role_id;
		this.user_id = user_id;
		this.role_id = role_id;
		this.role = role;
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserRole [user_role_id=" + user_role_id + ", user_id="
				+ user_id + ", role_id=" + role_id + ", role=" + role
				+ ", user=" + user + "]";
	}
	

	

	
	
	
}
