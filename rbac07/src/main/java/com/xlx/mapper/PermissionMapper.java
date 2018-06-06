package com.xlx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.xlx.entity.Permission;

@Mapper
public interface PermissionMapper {
    public List<Permission> FindPermission(Permission permission);
    public Permission getPermissionId(int permission_id);
    public int permissionUpdate(Permission permission);
    public int permissionInsert(Permission permission);
    public int permissionDelete(int permission_id);
}
