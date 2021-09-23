package com.cjc.Dao;

import java.util.List;

import com.cjc.model.User;

public interface HomeDaoI {

	public void saveUser(User u);

	public int loginCheck(String name, String pass);

	public List<User> dispalyAll();

	public int deleteUser(int uid);

	public User editUser(int uid);

	public void updateUser(User u);

}
