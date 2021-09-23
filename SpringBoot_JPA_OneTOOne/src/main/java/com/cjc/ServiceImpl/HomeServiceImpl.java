package com.cjc.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.Repository.HomeRepository;
import com.cjc.ServiceI.ServiceI;
import com.cjc.model.Student;

@Service
public class HomeServiceImpl implements ServiceI {
	
	@Autowired
	HomeRepository hr;

	@Override
	public void save(Student s) {
		
		hr.save(s);
	}

	@Override
	public Student logincheck(String un, String ps) {
		
		return hr.findAllByUnameAndPass(un, ps);
	}

	@Override
	public Iterable<Student> getAllData() {
		return hr.findAll();
	}

	

	@Override
	public void deleteData(Student s) {
	
		hr.delete(s);
		
	}

	@Override
	public Student editdata(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

}
