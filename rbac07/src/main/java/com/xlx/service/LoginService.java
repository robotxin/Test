package com.xlx.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xlx.entity.Permission;
import com.xlx.entity.Role;
import com.xlx.entity.User;
import com.xlx.mapper.LoginMapper;
@Service
public class LoginService {
	@Autowired
	private LoginMapper loginMapper;
	
	public List<User> Finduser(User user) {
		return loginMapper.Finduser(user);
	}
//	public List<User> FindByUserAccount(String user_account) {
//		return userMapper.FindByUserAccount(user_account);
//	}
	public List<Role> FindUserRole(User user) {
		return loginMapper.FindUserRole(user);
	}
	public List<Permission> FindAllUserRole(User user) {
		return loginMapper.FindAllUserRole(user);
	}
	public List<User> GetByUserNameAndPassord(String user_account,String password){
		return loginMapper.GetByUserNameAndPassord(user_account, password);
	}
	public long GetId(User user){
		return loginMapper.GetId(user);
	};
	public boolean verifyUser(User user) {
		
        if (loginMapper.GetByUserNameAndPassord(user.getUser_account(), user.getPassword()).isEmpty()) {
            return false;
        } else {
            return true;
        }

    }
	
}
