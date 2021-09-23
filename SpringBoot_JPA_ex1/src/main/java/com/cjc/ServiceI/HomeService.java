package com.cjc.ServiceI;

import java.util.List;

import com.cjc.model.Student;

public interface HomeService {

	public void save(Student s);

	

	public List<Student> getAllData();

	public void del(Student s);

	public Student editUser(int i);

	public Student updateUser(Student s);

	public List<Student> loginUser(String uname, String password);

	//public int del(int uid);

	

	

}
