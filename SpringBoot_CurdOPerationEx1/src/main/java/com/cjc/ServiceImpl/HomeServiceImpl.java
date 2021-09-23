package com.cjc.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.DaoI.DaoI;
import com.cjc.model.User;
import com.cjc.serviceI.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	DaoI d;

	@Override
	public void saveUser(User u) {
	
		d.saveUser(u);
		
	}

	@Override
	public int loginCheck(String name, String pass) {
		
		
		return  d.loginChcek(name,pass);
	}

	@Override
	public List<User> displayAll() {
		
		return d.displayAll();
	}

}
