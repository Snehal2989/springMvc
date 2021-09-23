package com.cjc.main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String msg(Model m)
	{
		String s= null;
		System.out.println(s.length());  // its gives error nullpointer ,so instead of that have to show proper msg 
		                                // for that using @Exceptionhandling
		m.addAttribute("msg","Welcome to controller based exception handling");
		return "Welcome";
	}
	
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionhandling(Model m)
	{
		m.addAttribute("errormsg","Plz enter the valid name throws NP exception");
		return "exmsg";
	}
}

