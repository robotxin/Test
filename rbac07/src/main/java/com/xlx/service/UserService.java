package com.xlx.service;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xlx.entity.User;
import com.xlx.mapper.UserMapper;
import com.xlx.service.UserService;

@Service
public class UserService{
	
	@Autowired
	private UserMapper userMapper;
	/**
	 * 新增用户信息
	 
	public void save(User user) {
		userMapper.save(user);
	}*/
	public int userinsert(User user) {
		return userMapper.userinsert(user);
	}
	
	/**
	 * 根据账号名称删除用户信息
	 * public boolean delete(String user_account) {
		return userMapper.delete(user_account);
	}
	 */
	
	 public  int userdelete(int user_id){
		 return userMapper.userdelete(user_id);
	 };
	
	/**
	 * 根据账号名称更改用户信息
	 * public boolean update(User user) {
		return userMapper.update(user);
	}
	 */
	
	public int userupdate(User user){
		return userMapper.userupdate(user);
	};
	/**
	 * 根据用户id查询用户信息

	 */
	public User getid(int user_id ) {
		return userMapper.getid(user_id);
	}
	
	/**
	 * 根据账号名称查询用户信息
	 * public User findByAccount(String user_account) {
		User user = userMapper.findByAccount(user_account);
		return user;
	}
	 */
	
	/**
	 * 显示用户列表
	 */

	public List<User> Finduser(User user) {
		//List<User> findAllList = userMapper.FindAll(user);
		//return findAllList;
		return userMapper.Finduser(user);
	}
	public List<User> FindUserRole(User user) {
		return userMapper.FindUserRole(user);
	}
	public List<User> FindAllUserRole(User user) {
		return userMapper.FindAllUserRole(user);
	}
	

}
