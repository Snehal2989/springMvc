package com.cjc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.ServiceI.HomeService;
import com.cjc.model.Student;

@Controller
public class HomeController {
	@Autowired
	HomeService hm;
	
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
	public String save(@ModelAttribute Student s)
	{
		System.out.println(s);
		hm.save(s);
		return"login";
	}
	
	@RequestMapping("/log")
	public String loginUser(@ModelAttribute Student s ,Model m) {
		
		List<Student> al= hm.loginUser(s.getUname(),s.getPassword());
		if(al.isEmpty()) {
			return "login";
		}
		else {
			m.addAttribute("data", al);
			return "success";
		}

	}
	
	@RequestMapping("/edit")
	public String editUser(@RequestParam int uid,Model m) {
		
				Student s=hm.editUser(uid);
				m.addAttribute("st1",s);
		return "update";
	}
	
	
	@RequestMapping("/update")
	public String update(@ModelAttribute Student s,Model m)
	
	{
		System.out.println(s);
		hm.save(s);
		
		m.addAttribute("data", hm.getAllData());
		return "success";
		
	}
	
	
}
