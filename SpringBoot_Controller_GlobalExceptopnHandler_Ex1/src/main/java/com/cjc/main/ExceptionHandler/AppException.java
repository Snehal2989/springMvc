package com.cjc.main.ExceptionHandler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ControllerAdvice
public class AppException {

	@ExceptionHandler(value=NullPointerException.class)
	public String error(Model m)
	{
		m.addAttribute("msg3","Plz enter the valid name");
		return "excepthand";
	}
	
	@ExceptionHandler(value=ArithmeticException.class)
	public String error1(Model m)
	{
		m.addAttribute("msg4","Plz enter the valid number");
		return "excepthand";
	}
}
