package com.cjc.main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;

@Repository
public interface HomeRepo extends JpaRepository<Student,Integer> {

	 List<Student> findAllBySnameAndSlast(String sname, String slast);

}
