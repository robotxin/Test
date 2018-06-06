package com.xlx.entity;

public class UserRolee {
	
	private User user;
	private Role role;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public UserRolee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRolee(User user, Role role) {
		super();
		this.user = user;
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserRole [user=" + user + ", role=" + role + "]";
	}
	
}
