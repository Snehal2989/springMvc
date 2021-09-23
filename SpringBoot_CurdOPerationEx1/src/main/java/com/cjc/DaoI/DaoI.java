package com.cjc.DaoI;

import java.util.List;

import com.cjc.model.User;

public interface DaoI {

	public void saveUser(User u);

	public int loginChcek(String name, String pass);

	public List<User> displayAll();

}
