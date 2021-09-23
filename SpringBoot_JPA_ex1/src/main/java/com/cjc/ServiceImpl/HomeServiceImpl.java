package com.cjc.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.Repository.HomeRepository;
import com.cjc.ServiceI.HomeService;
import com.cjc.model.Student;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	HomeRepository hr;

	@Override
	public void save(Student s) {
		
		hr.save(s);
		
	}



	@Override
	public List<Student> getAllData() {
		
		return (List<Student>) hr.findAll();
	}

	@Override
	public void del(Student s) {
	
		hr.delete(s);
		
	}

	

	@Override
	public Student updateUser(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student editUser(int uid) {
		// TODO Auto-generated method stub
		return hr.findByUid(uid);
	}

	@Override
	public List<Student> loginUser(String uname, String password) {
		return hr.findAllByUnameAndPassword(uname, password);
	}

//	@Override
//	public int del(int uid) {
//		//return hr.deleteById(uid);
//		//hr.deleteAllById(uid);
//	//int x=	hr.delete(uid);
//		hr.deleteById(uid);
//	return 1;
//	}

	
	
}
