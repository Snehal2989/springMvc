package com.cjc.HOmeServiceImpl;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.cjc.serviceI;
import com.cjc.Repository.HomeRepository;
import com.cjc.model.User;
import com.cjc.serviceI.ServiceI;

@Service
public class HomeServiceImpl  implements ServiceI{
	
	@Autowired
	HomeRepository hr;

	@Override
	public void saveUser(User u) {

      hr.save(u);
		
	}

	@Override
	public User logincheck(String un, String pss) {
		
		return hr.findALLByUnameAndPass(un, pss);
	}

	@Override
	public Iterable<User> getAlldata() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public void deldata(User u) {


		hr.delete(u);
	}

	@Override
	public User editdata(User u) {
		
		return hr.save(u);
	}

	@Override
	public void updateUser(User u) {

    hr.save(u);
		
	}

//	@Override
//	public User deldata(User u) {
//		
//		return hr.delete(u);
//	}

	

	
	

	

	
	

}
