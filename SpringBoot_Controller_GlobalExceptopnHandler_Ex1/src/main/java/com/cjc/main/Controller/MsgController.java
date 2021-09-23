package com.cjc.main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MsgController {

	
	@RequestMapping("/")
	public String msg(Model m)
	{
		m.addAttribute("msg1","Welcome to global exxception handling");
		String s=null;
		s.length();
		return "Welcome";
	}
}
