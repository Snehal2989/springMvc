package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 int uid;
	String name;
	String uname;
	String password;
	long mobileno;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
	
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + ", uname=" + uname + ", password=" + password + ", mobileno="
				+ mobileno + "]";
	}
	
	
}
