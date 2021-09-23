package com.cjc.main.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Datedisplay {

	@RequestMapping("/date")
	public String display(Model m)
	{
		m.addAttribute("msg2","Todays Date :" +new Date() );
//		String s=null;
//		s.length();
		
		int y=10/0;
		return "Displaydate";
	}
}
