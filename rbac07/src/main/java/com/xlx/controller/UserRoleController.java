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
import com.xlx.entity.UserRole;
import com.xlx.service.UserRoleService;
import com.xlx.service.UserService;


@Controller
//@RequestMapping("/user")
public class UserRoleController {
	@Autowired
	private UserService userservice;
	
	@Autowired
	private UserRoleService userroleservice;
	/*
	 * 新增用户信息
	 * @RequestMapping(value="/userinsert")
    public String userinsert (Model model,User user){
    	this.userservice.userinsert(user);
    	return "forward:FindAll";
    }  
	 */
	
	/*
	 * 新增用户角色信息
	 */
	@RequestMapping(value="/userRoleInsert")
	public String userRoleInsert (Model model,User user,UserRole userrole,HttpServletRequest request, HttpSession session
){
		this.userservice.userinsert(user);
		this.userroleservice.UserRoleInsert(userrole);
		return "forward:FindAllUserRole";
	}   
	/*
	 * 新增用户角色关系
	 */
	@RequestMapping(value="/userRoleInsertTo")
	public String userRoleInsertto (Model model,User user,UserRole userrole,HttpServletRequest request, HttpSession session
){
		this.userroleservice.UserRoleInsert(userrole);
		return "forward:Find";
	}   
	/*
	 * 根据用户id删除用户和用户角色关系
	 */
    
    @RequestMapping(value="/userRoleDelete")
	public  String userdelete(int user_id,HttpServletRequest request, HttpSession session
){
		this.userservice.userdelete(user_id);
		this.userroleservice.UserRoleDelete(user_id);
		return "redirect:FindAllUserRole";
    }
    /*
     * 删除用户角色关系
     */
    @RequestMapping(value="/userRoleDeleteTo")
    public  String userdeleteTo(int user_role_id,HttpServletRequest request, HttpSession session
){
    	this.userroleservice.UserRoleDeleteTo(user_role_id);
    	return "redirect:Find";
    }
    /*
     * 根据id查找用户信息
     * 	@RequestMapping(value="/getid")
	public String getid(Model model, int user_id) {
		User User = userservice.getid(user_id);
		model.addAttribute("user",User);
		System.out.println(User);
		return "userupdate";
	}
     */

    /*
     * 根据id查找角色信息
     */
	@RequestMapping(value="/getUserRoleId")
	public String getUserRoleId(Model model, int user_id,HttpServletRequest request, HttpSession session
) {
//		UserRole userRole= userroleservice.getUserRoleId(user_id);
//		model.addAttribute("userRole",userRole);
//		System.out.println(userRole);
		User User = userservice.getid(user_id);
		model.addAttribute("user",User);
		System.out.println(User);
		return "userRoleUpdate";
	}
    /*
     * 更新信息
     * user.setUser_account("qwewe");
		user.setUser_nickname("dwqdw");

     */
//    @RequestMapping(value="userupdate")
//	public String userupdate(User user){
//		this.userservice.userupdate(user);
//				return "redirect:FindAll";
//    }
//    @RequestMapping(value="userupdate")
//    public String userupdate(User user){
//    	this.userservice.userupdate(user);
//    	return "redirect:FindAll";
//    }
    /*
     * 更新用户角色信息
     */
    @RequestMapping(value="userRoleUpdate")
    public String userRoleUpdate(UserRole userRole,HttpServletRequest request, HttpSession session
){
    	this.userroleservice.UserRoleUpdate(userRole);
    	return "redirect:FindAllUserRole";
    }
	//增加跳转
	@RequestMapping(value="toUserRoleAdd")
	public String  UserRoleAdd(HttpServletRequest request, HttpSession session
)
	{
		return  "UserRoleAdd";
	}
	//增加跳转
	@RequestMapping(value="toUserRoleAddTo")
	public String  UserRoleAddTo(HttpServletRequest request, HttpSession session
)
	{
		Object testrole = session.getAttribute("userrole");
		String testpermission = (String)session.getAttribute("userpermission").toString();
		System.out.println(testrole.toString());
		System.out.println(testpermission.toString());
		if(testpermission.contains("修改用户角色表")){
			return "UserRoleAddTo";
		}else return "redirect:/";
		//return  "UserRoleAddTo";
	}
    /*
     * 查询全部
     */
//    @RequestMapping(value="/FindAll")
//    public String FindAll(Model model,User user){
//    	List<User> ulist = new ArrayList<>();
//    	ulist = userservice.Finduser(user);
//    	model.addAttribute("ulist", ulist);
//		model.addAttribute("contens",userservice.Finduser(user));
//		System.out.println(ulist);
//		return "ulist";
//    }
    @RequestMapping(value="/FindUserRole")
    public String FindUserRole(Model model,User user,HttpServletRequest request, HttpSession session
){
    	List<User> urlist = new ArrayList<>();
    	urlist = userservice.FindUserRole(user);
    	model.addAttribute("urlist", urlist);
    	//List<Role> role = new ArrayList<>();
    	//model.addAttribute("role",role);
    	model.addAttribute("contens",userservice.FindUserRole(user));
    	System.out.println(urlist);
    	return "urlist";
    }
    /*
     * 查询用户角色权限
     */
    @RequestMapping(value="/FindAllUserRole")
    public String FindAllUserRole(Model model,User user,HttpServletRequest request, HttpSession session){
    	List<User> userrolelist = new ArrayList<>();
    	userrolelist = userservice.FindAllUserRole(user);
    	model.addAttribute("userrolelist", userrolelist);
		model.addAttribute("contens",userservice.FindAllUserRole(user));
		System.out.println(userrolelist);
		String testpermission = (String)session.getAttribute("userpermission").toString();
		System.out.println(testpermission.toString());
		if(testpermission.contains("查看员工表")){
			return "/userrolelist";
		}else return "redirect:/";
		//return "userrolelist";
    }
    /*
     * 查询用户id角色id表
     */
    @RequestMapping(value="/Find")
    public String Find(Model model,UserRole userRole,User user,Role role,HttpServletRequest request, HttpSession session){
    	List<UserRole> aaa = new ArrayList<>();
    	aaa = userroleservice.UserRoleSelect(userRole);
    	model.addAttribute("aaa", aaa);
    	model.addAttribute("user", user);
		model.addAttribute("contens",userroleservice.UserRoleSelect(userRole));
		System.out.println(aaa);
		Object testrole = session.getAttribute("userrole");
		String testpermission = (String)session.getAttribute("userpermission").toString();
		System.out.println(testrole.toString());
		System.out.println(testpermission.toString());
		if(testpermission.contains("查看用户角色表")){
			return "UserRole";
		}else return "redirect:/";
		//return "UserRole";
    }
    
	
}
