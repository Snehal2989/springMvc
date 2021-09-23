package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.User;
import com.cjc.serviceI.HomeService;


@Controller
public class HomeController {
	
	@Autowired
	HomeService hs;
	
	
	@RequestMapping("/")
	public String prelogin()
	{
		System.out.println("in login");
		return "login";
	}

	@RequestMapping("/Register")
	public String prereg()
	{
		System.out.println("in register");
		return "Register";
	}
	
	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute("user") User u)
	{
		System.out.println("in save");
		System.out.println(u);
	hs.saveUser(u);
		return "login";
	}

	@RequestMapping("/log")
	public String logincheck(@RequestParam String name ,@RequestParam String pass,Model  m)

	{
		System.out.println(name);
		System.out.println(pass);
		
		int id=hs.loginCheck(name,pass);
		if(id>0)
		{
		List<User> us=hs.displayAll();
		m.addAttribute("user",us);
		return "Success";
		
		}
		return "login";
	}
	
	@RequestMapping("/del")
	public String delete(@RequestParam int uid ,Model m)
	{
		System.out.println("In delete method");
		int id=hs.deleteUser(uid);
		List<User> list=hs.displayAll();
		//List<User> list=hs.getAllUser();
		
		if(id>0)
		{
			m.addAttribute("user",list);
			return "Success";
		}
		
		return "Success";
	}

	@RequestMapping("/edit")
	public String editUser(@RequestParam int uid,Model m)
	{
		System.out.println("In edit method");
		User u=hs.editUser(uid);
		List<User> u1= hs.displayAll();
		//List<User> u1=hs.getAllUsers();
		if(u!=null)
		{
			m.addAttribute("u",u);
			System.out.println("Hello");
			return "Update";
		}
		else
		{
			m.addAttribute("user",u1);
			System.out.println("Hi");
			return "Success";
			
		}
	}
	
	@RequestMapping("/update")
	public String UpdateUser(@ModelAttribute User u,Model m)
	{
		hs.updateUser(u);
		List<User> list_u=hs.displayAll();
		//List<User> list_u=hs.getAllUser();
		m.addAttribute("user",list_u);
		return "Success";
	}

}
