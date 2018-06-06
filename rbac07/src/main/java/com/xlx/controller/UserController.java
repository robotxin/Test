package com.xlx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xlx.entity.User;
import com.xlx.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userservice;
	
	/*
	 * 新增用户信息
	 */
	@RequestMapping(value="/userinsert")
    public String userinsert (Model model,User user,HttpServletRequest request, HttpSession session
){
    	this.userservice.userinsert(user);
    	return "forward:FindAll";
    }  
	/*
	 * 根据用户名删除
	 *     
	 */
	@RequestMapping(value="/userdelete")
	public  String userdelete(int user_id,HttpServletRequest request, HttpSession session
){
		this.userservice.userdelete(user_id);
		return "redirect:FindAll";
    }
    /*
     * 根据id查找用户信息
     */
	@RequestMapping(value="/getid")
	public String getid(Model model, int user_id,HttpServletRequest request, HttpSession session
) {
		User User = userservice.getid(user_id);
		model.addAttribute("user",User);
		System.out.println(User);
		return "userupdate";
	}
	//更新角色信息
    @RequestMapping(value="userupdate")
    public String userupdate(User user,HttpServletRequest request, HttpSession session
){
    	this.userservice.userupdate(user);
    	return "redirect:testresult";
    }
    /*
     * 查询全部用户
     */
    @RequestMapping(value="/FindAll")
    public String FindAll(Model model,User user,HttpServletRequest request, HttpSession session
){
    	List<User> ulist = new ArrayList<>();
    	ulist = userservice.Finduser(user);
    	model.addAttribute("ulist", ulist);
		model.addAttribute("contens",userservice.Finduser(user));
		System.out.println(ulist);
		return "ulist";
    }
	//增加跳转
	@RequestMapping(value="toAdd")
	public String  Add(HttpServletRequest request, HttpSession session
)
	{
		Object testrole = session.getAttribute("userrole");
		String testpermission = (String)session.getAttribute("userpermission").toString();
		System.out.println(testrole.toString());
		System.out.println(testpermission.toString());
		if(testpermission.contains("修改员工表")){
			return "useradd";
		}else return "redirect:/";
		//return  "useradd";
	}
}
