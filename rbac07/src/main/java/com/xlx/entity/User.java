package com.xlx.entity;

import java.io.Serializable;
//import java.sql.Timestamp;
import java.util.List;
/**
 * Description	Resource	Path	Location	Type
Archive for required library: 'D:/Program Files/maven/apache-maven-3.5.3-bin/maven-repository/org/thymeleaf/thymeleaf/2.1.5.RELEASE/thymeleaf-2.1.5.RELEASE.jar' in project 'newtime' cannot be read or is not a valid ZIP file	newtime		Build path	Build Path Problem

 */


/**
 * 
 drop table if exists TBL_User;
create table TBL_User (
user_id bigint not null primary key auto_increment  comment '用户id' ,
user_account varchar(200) not null comment '用户账号名称',
password char(200) not null comment '密码',
user_nickname varchar(200) not null comment '用户昵称',
creat_time timestamp not null default now() comment'用户创建时间',
modify_time timestamp comment'用户修改时间',
user_status char not null default '0' comment '全局参数状态，0:未启用，1:已启用'
);
 */

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long user_id;
	private String user_account;
	private String password;
	private String user_nickname;
//	private Timestamp creat_time;
//	private Timestamp modify_time;
//	private String user_status;
	private List<Role> role;
	private List<Permission> permission;
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_nickname() {
		return user_nickname;
	}
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
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
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long user_id, String user_account, String password,
			String user_nickname, List<Role> role, List<Permission> permission) {
		super();
		this.user_id = user_id;
		this.user_account = user_account;
		this.password = password;
		this.user_nickname = user_nickname;
		this.role = role;
		this.permission = permission;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_account=" + user_account
				+ ", password=" + password + ", user_nickname=" + user_nickname
				+ ", role=" + role + ", permission=" + permission + "]";
	}

	
	
}
