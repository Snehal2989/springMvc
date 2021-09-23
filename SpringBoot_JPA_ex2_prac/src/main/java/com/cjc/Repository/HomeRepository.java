package com.cjc.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.User;

@Repository
public interface HomeRepository extends CrudRepository<User,Integer>{
	
	public User findALLByUnameAndPass(String un, String pss);

}
