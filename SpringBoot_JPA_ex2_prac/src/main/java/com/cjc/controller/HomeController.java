package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.User;
import com.cjc.serviceI.ServiceI;

@Controller
public class HomeController {
	
	@Autowired
	ServiceI s;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}

	
	@RequestMapping("/Register")
	public String prereg()
	{
		return "Register";
	}
	
	@RequestMapping("/reg")
	public String save(@ModelAttribute User u)
	{
		s.saveUser(u);
		
		return "login";
	}
	
	@RequestMapping("/log")
	public String logindata(@RequestParam("uname") String un,@RequestParam("pass") String pss,Model m)
	{
		User u=s.logincheck(un,pss);
		
		if(u!=null)
		{
			Iterable<User> u1=s.getAlldata();
		m.addAttribute("data",u1);
		return "Success";
		}
		return "login";
	}
	
	@RequestMapping("/delete")
	public String del(@ModelAttribute User u,Model m)
	{
//		User u1=s.deldata(u);
//		if(u1!=null)
//		{
//		Iterable<User> u2=s.getAlldata();
//		m.addAttribute("data",u2);
//		return "Success";
//		}
		
		s.deldata(u);
		Iterable<User> u2=s.getAlldata();
		m.addAttribute("data",u2);
		return "Success";
	}

	@RequestMapping("/edit")
	public String editdata(@ModelAttribute User u,Model m)
	{
		User u1=s.editdata(u);
		if(u1!=null)
		{
			
			Iterable<User> u2=s.getAlldata();
			m.addAttribute("u",u1);
			return "update";
		}
		else {
			Iterable<User> us=s.getAlldata();
			m.addAttribute("data",us);
			return "Success";
		}
		
	}
	
	@RequestMapping("/update")
	public String updateUser(@ModelAttribute User u,Model m)
	{
		System.out.println("In update mode");
		s.saveUser(u);
		Iterable<User> u2 = s.getAlldata();
		m.addAttribute("data",u2);
		return "Success";
	}
}
