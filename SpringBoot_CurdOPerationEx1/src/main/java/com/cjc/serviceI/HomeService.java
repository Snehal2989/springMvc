package com.cjc.serviceI;

import java.util.List;

import com.cjc.model.User;

public interface HomeService {

	public void saveUser(User u);

	public int loginCheck(String name, String pass);

	public List<User> displayAll();

}
