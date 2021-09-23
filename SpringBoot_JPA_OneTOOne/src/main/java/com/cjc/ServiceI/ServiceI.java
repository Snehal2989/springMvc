package com.cjc.ServiceI;

import com.cjc.model.Student;

public interface ServiceI {

	public void save(Student s);

	public Student logincheck(String un, String ps);

	public Iterable<Student> getAllData();

	public void deleteData(Student s);

	public Student editdata(Student s);

}
