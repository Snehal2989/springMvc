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
public class homeController {
	
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
	public String saveUser(@ModelAttribute User u)
	{
		System.out.println("in save");
		System.out.println(u);
		hs.saveUser(u);
		return "login";
	}
	
	@RequestMapping("/log")
	public String logincheck(@RequestParam String name ,@RequestParam String pass,Model m)

	{
		System.out.println(name);
		System.out.println(pass);
		
		int id=hs.loginCheck(name,pass);
		if(id>0)
		{
		List<User> us=hs.displayAll();
		m.addAttribute("User",us);
		return "Success";
		
		}
		return "login";
	}
	
}
