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
import com.xlx.entity.User;
import com.xlx.service.RoleService;

@Controller
//@RequestMapping("/role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	/**
     * 查询全部角色信息
     */
    @RequestMapping(value="/Findallrole")
    public String FindAll(Model model,Role role,HttpServletRequest request, HttpSession session
){
    	List<Role> rolelist = new ArrayList<>();
    	rolelist = roleService.FindRole(role);
    	model.addAttribute("rolelist", rolelist);
		model.addAttribute("contens",roleService.FindRole(role));
		System.out.println(rolelist);
		Object testrole = session.getAttribute("userrole");
		String testpermission = (String)session.getAttribute("userpermission").toString();
		System.out.println(testrole.toString());
		System.out.println(testpermission.toString());
		if(testpermission.contains("查看角色表")){
			return "/rolelist";
		}else return "redirect:/";
		//return "rolelist";
    }
	/**
     * 根据用户id查找角色
     */
	@RequestMapping(value="/getRoleId")
	public String getid(Model model, int role_id,HttpServletRequest request, HttpSession session
) {
		Role role = roleService.getRoleId(role_id);
		model.addAttribute("role",role);
		System.out.println(role);
		return "RoleUpdate";
	}
    /**
     * 更新信息
     */
    @RequestMapping(value="/roleUpdate")
	public String roleUpdate(Role role,HttpServletRequest request, HttpSession session
){
		this.roleService.roleUpdate(role);
		return "redirect:/Findallrole";
    }
	/**
	 * 新增角色信息
	 */
	@RequestMapping(value="/roleInsert")
    public String roleInsert(Model model,Role role,HttpServletRequest request, HttpSession session
){
    	this.roleService.roleInsert(role);
    	Object testrole = session.getAttribute("userrole");
		String testpermission = (String)session.getAttribute("userpermission").toString();
		System.out.println(testrole.toString());
		System.out.println(testpermission.toString());
		if(testpermission.contains("修改角色表")){
			return "forward:/Findallrole";
		}else return "redirect:/";
    	//return "forward:/Findallrole";
    }   
	/**
	 * 根据权限id删除
	 */
    
    @RequestMapping(value="/roleDelete")
	public String roleDelete(int role_id,HttpServletRequest request, HttpSession session
){
		this.roleService.roleDelete(role_id);
		return "redirect:/Findallrole";
    }
	//增加跳转
	@RequestMapping(value="toRoleAdd")
	public String  roleAdd(HttpServletRequest request, HttpSession session
)
	{
    	Object testrole = session.getAttribute("userrole");
		String testpermission = (String)session.getAttribute("userpermission").toString();
		System.out.println(testrole.toString());
		System.out.println(testpermission.toString());
		if(testpermission.contains("修改角色表")){
			return "RoleAdd";
		}else return "redirect:/";
		//return  "RoleAdd";
	}

}
