package com.xlx.entity;
/**
 * 
create table TBL_permission(
permission_id bigint not null primary key auto_increment comment '权限id',
permission_name varchar(100) not null comment '权限名称'
);
 */
public class Permission {
	private Long permission_id;
	private String permission_name;
	public Long getPermission_id() {
		return permission_id;
	}
	public void setPermission_id(Long permission_id) {
		this.permission_id = permission_id;
	}
	public String getPermission_name() {
		return permission_name;
	}
	public void setPermission_name(String permission_name) {
		this.permission_name = permission_name;
	}
	public Permission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Permission(Long permission_id, String permission_name) {
		super();
		this.permission_id = permission_id;
		this.permission_name = permission_name;
	}
	@Override
	public String toString() {
		return permission_name;
	}
	
	
	
}
