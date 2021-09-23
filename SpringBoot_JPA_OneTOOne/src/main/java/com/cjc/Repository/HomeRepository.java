package com.cjc.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student,Integer>{
	
	public Student findAllByUnameAndPass(String un,String ps);

}
