package com.cjc.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student,Integer>{

	public List<Student> findAllByUnameAndPassword(String uname, String password);

	public Student findByUid(int uid);

	

}
