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
import com.xlx.entity.User;
import com.xlx.service.LoginService;
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	/**
	 * 
	 * @Title: login 
	 * @Description: 把session中的信息都移除
	 */
	@RequestMapping(value = "/")
    public String login (Model model,User user,HttpServletRequest request, HttpSession session) {
		session.removeAttribute("account");
		session.removeAttribute("userrole");
		session.removeAttribute("userpermission");
		model.addAttribute("wqe",loginService.Finduser(user));
		model.addAttribute("user",user);
		return "/Login";
    }
	@RequestMapping(value = "/test")
	public String test(Model model,User user,HttpServletRequest request, HttpSession session) {
		session.getAttribute("account");
		Object testrole = session.getAttribute("userrole");
		String testpermission = (String)session.getAttribute("userpermission").toString();
		System.out.println(testrole.toString());
		System.out.println(testpermission.toString());
		if(testpermission.contains("更改人员角色")){
			return "/test";
		}else return "redirect:/";
	}
	@RequestMapping(value = "/userLogin")
    public String userLogin(User user, Model model,HttpServletRequest request, HttpSession session) {
        boolean verify = loginService.verifyUser(user);
        List<Role> userrole = loginService.FindUserRole(user);
        List<Permission> userpermission = loginService.FindAllUserRole(user);
        
        String account = request.getParameter("user_account");
        String password = request.getParameter("password");
        session.setAttribute("account", account);
        session.setAttribute("password", password);
        session.setAttribute("userrole", userrole);

//        List<User> list = new ArrayList<>();
//        list = loginService.GetByUserNameAndPassord(account, password);
//        model.addAttribute("content",list);
//        System.out.println(list);
        session.setAttribute("userpermission", userpermission);
        model.addAttribute("userpermission",userpermission);
        if (verify) {
            model.addAttribute("user_account", user.getUser_account());
            model.addAttribute("password", user.getPassword());
            Long id = loginService.GetId(user);
            session.setAttribute("id", id);
            model.addAttribute("userrole",userrole);
            model.addAttribute("id",id);
            System.out.println(id);
            return "result";
        } else {
        	return "redirect:/";
        }

    }
	
	@RequestMapping(value = "/testresult")
    public String testresult(User user, Model model,HttpServletRequest request, HttpSession session) {
        session.getAttribute("account");
        session.getAttribute("password");
        session.getAttribute("userrole");
        
        session.getAttribute("userpermission");
        return "testresult";
    }
}
