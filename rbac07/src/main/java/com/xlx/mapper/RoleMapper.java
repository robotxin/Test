package com.xlx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xlx.entity.Role;

@Mapper
public interface RoleMapper {
    public List<Role> FindRole(Role role);
    public Role getRoleId(int role_id);
    public int roleUpdate(Role role);
    public int roleInsert(Role role);
    public int roleDelete(int role_id);
}
