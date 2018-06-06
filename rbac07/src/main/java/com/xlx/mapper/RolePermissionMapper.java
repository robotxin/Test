package com.xlx.mapper;

import java.util.List;

import com.xlx.entity.RolePermission;

public interface RolePermissionMapper {
	public int RolePermissionInsert(RolePermission rolePermission);
	public int RolePermissionDelete(int user_permission_id);
	public int RolePermissionUpdate(RolePermission rolePermission);
    public List<RolePermission> RolePermissionSelect(RolePermission rolePermission);
}
