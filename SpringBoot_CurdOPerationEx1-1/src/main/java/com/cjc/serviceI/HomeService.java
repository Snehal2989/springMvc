package com.cjc.serviceI;

import java.util.List;

import com.cjc.model.User;

public interface HomeService {

	public void saveUser(User u);

	public int loginCheck(String name, String pass);

	public List<User> displayAll();

	public int deleteUser(int uid);

	public User editUser(int uid);

	public void updateUser(User u);

	

}
