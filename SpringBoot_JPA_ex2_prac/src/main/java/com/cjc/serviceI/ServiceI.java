package com.cjc.serviceI;

import java.util.List;

import com.cjc.model.User;

public interface ServiceI {

	public void saveUser(User u);

	public User logincheck(String un, String pss);

	public Iterable<User> getAlldata();

	public void deldata(User u);

	public User editdata(User u);

	public void updateUser(User u);

	//public User deldata(User u);

	

	
}
