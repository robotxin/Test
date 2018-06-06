package com.xlx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xlx.entity.Permission;
import com.xlx.entity.Role;
import com.xlx.service.PermissionService;


@Controller
//@RequestMapping("/permission")
public class PermissionController {
	@Autowired
	private PermissionService permissionService;
	
	/*
     * 查询全部权限信息
     */
    @RequestMapping(value="/Findallpermission")
    public String FindAllPermission(Model model,Permission permission,HttpServletRequest request, HttpSession session){
    	List<Permission> permissionlist = new ArrayList<>();
    	permissionlist = permissionService.FindAllPermission(permission);
    	model.addAttribute("permissionlist", permissionlist);
		model.addAttribute("contens",permissionService.FindAllPermission(permission));
		System.out.println(permissionlist);
		Object testrole = session.getAttribute("userrole");
		String testpermission = (String)session.getAttribute("userpermission").toString();
		System.out.println(testrole.toString());
		System.out.println(testpermission.toString());
		if(testpermission.contains("查看权限表")){
			return "permissionlist";
		}else return "redirect:/";
		//return "permissionlist";
    }
	/*
	 * 新增权限信息
	 */
	@RequestMapping(value="/permissionInsert")
    public String permissionInsert(Model model,Permission permission,HttpServletRequest request, HttpSession session
){
    	this.permissionService.permissionInsert(permission);
		Object testrole = session.getAttribute("userrole");
		String testpermission = (String)session.getAttribute("userpermission").toString();
		System.out.println(testrole.toString());
		System.out.println(testpermission.toString());
		if(testpermission.contains("修改权限表")){
			return "forward:/Findallpermission";
		}else return "redirect:/";
    	//return "forward:/Findallpermission";
    }   
	/*
	 * 根据id删除权限
	 */
    
    @RequestMapping(value="/permissionDelete")
	public  String permissionDelete(int permission_id,HttpServletRequest request, HttpSession session
){
		this.permissionService.permissionDelete(permission_id);
		return "redirect:/Findallpermission";
    }
	/**
     * 根据用户id查找角色
     */
	@RequestMapping(value="/getPermissionId")
	public String getid(Model model, int permission_id,HttpServletRequest request, HttpSession session
) {
		Permission permission= permissionService.getPermissionId(permission_id);
		model.addAttribute("permission",permission);
		System.out.println(permission);
		return "PermissionUpdate";
	}
    /*
     * 更新信息
     */
    @RequestMapping(value="/permissionUpdate")
	public  String permissionUpdate(Permission permission,HttpServletRequest request, HttpSession session
){
		this.permissionService.permissionUpdate(permission);
		return "redirect:/Findallpermission";
    }
	//增加跳转
	@RequestMapping(value="toPermissionAdd")
	public String  permissionAdd(HttpServletRequest request, HttpSession session
)
	{
		Object testrole = session.getAttribute("userrole");
		String testpermission = (String)session.getAttribute("userpermission").toString();
		System.out.println(testrole.toString());
		System.out.println(testpermission.toString());
		if(testpermission.contains("修改权限表")){
			return "PermissionAdd";
		}else return "redirect:/";
		//return  "PermissionAdd";
	}
}
