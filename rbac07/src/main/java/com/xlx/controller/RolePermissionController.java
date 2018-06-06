package com.xlx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xlx.entity.Role;
import com.xlx.entity.RolePermission;
import com.xlx.entity.User;
import com.xlx.entity.UserRole;
import com.xlx.service.RolePermissionService;

@Controller
public class RolePermissionController {
	@Autowired
	private RolePermissionService rolePermissionService;
	
	  /*
     * 查询用户id角色id表
     */
    @RequestMapping(value="/FindRolePermission")
    public String Find(Model model,RolePermission rolePermission,com.xlx.entity.Permission permission,Role role,HttpServletRequest request, HttpSession session
){
    	List<RolePermission> bbb = new ArrayList<>();
    	bbb = rolePermissionService.RolePermissionSelect(rolePermission);
    	model.addAttribute("bbb", bbb);
    	//model.addAttribute("user", user);
		//model.addAttribute("contens",userroleservice.UserRoleSelect(userRole));
		System.out.println(bbb);
		Object testrole = session.getAttribute("userrole");
		String testpermission = (String)session.getAttribute("userpermission").toString();
		System.out.println(testrole.toString());
		System.out.println(testpermission.toString());
		if(testpermission.contains("查看角色权限表")){
			return "RolePermission";
		}else return "redirect:/";
		//return "RolePermission";
    }
	/*
	 * 新增角色权限关系
	 */
	@RequestMapping(value="/rolePermissionInsert")
	public String rolePermissionInsert (Model model,RolePermission rolePermission,HttpServletRequest request, HttpSession session
){
		this.rolePermissionService.RolePermissionInsert(rolePermission);
	
		return "forward:FindRolePermission";
	} 
	   /*
     * 删除用户角色关系
     */
    @RequestMapping(value="/rolePermissionDelete")
    public  String rolePermissionDelete(int user_permission_id,HttpServletRequest request, HttpSession session
){
    	this.rolePermissionService.RolePermissionDelete(user_permission_id);
    	return "redirect:FindRolePermission";
    }
	//增加跳转
	@RequestMapping(value="toRolePermissionAddTo")
	public String  RolePermissionAddTo(HttpServletRequest request, HttpSession session
)
	{
		Object testrole = session.getAttribute("userrole");
		String testpermission = (String)session.getAttribute("userpermission").toString();
		System.out.println(testrole.toString());
		System.out.println(testpermission.toString());
		if(testpermission.contains("修改角色权限表")){
			return "RolePermissionAddTo";
		}else return "redirect:/";
		//return  "RolePermissionAddTo";
	}
}
