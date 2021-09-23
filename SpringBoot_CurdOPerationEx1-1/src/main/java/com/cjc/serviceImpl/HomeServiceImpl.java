package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.Dao.HomeDaoI;
import com.cjc.model.User;
import com.cjc.serviceI.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	HomeDaoI hd;

	@Override
	public void saveUser(User u) {
		
		hd.saveUser(u);
		
	}

	@Override
	public int loginCheck(String name, String pass) {
	
		int id =hd.loginCheck(name, pass);
		return id;
	}

	@Override
	public List<User> displayAll() {
		
		return hd.dispalyAll();
	}

	@Override
	public int deleteUser(int uid) {
		
		return hd.deleteUser(uid);
	}

	@Override
	public User editUser(int uid) {
		
		return hd.editUser(uid);
	}

	@Override
	public void updateUser(User u) {
		
		hd.updateUser(u);
		
	}

	
}
