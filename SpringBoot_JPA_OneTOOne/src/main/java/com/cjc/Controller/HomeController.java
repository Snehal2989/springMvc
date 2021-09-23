package com.cjc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.ServiceI.ServiceI;
import com.cjc.model.Student;

@Controller
public class HomeController {
	
	@Autowired
	ServiceI si;
	
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
	public String save(@ModelAttribute ("student") Student s)
	{
		si.save(s);
		return "login";
	}
	
	@RequestMapping("/log")
	public String logindata(@RequestParam("uname") String un,@RequestParam("pass") String ps,Model m)
	{
		Student s=si.logincheck(un,ps);
		if(s!=null)
		{
			Iterable<Student> s1=si.getAllData();
			m.addAttribute("data",s1);
			return "Success";
		}
		return "login";
	}
	
	@RequestMapping("/delete")
	public String deleteData(@ModelAttribute ("student") Student s,Model m)
	{
		si.deleteData(s);
		Iterable<Student> s1 = si.getAllData();
		return "Success";
	}
	
	@RequestMapping("/edit")
	public String editData(@ModelAttribute ("student") Student s,Model m)
	{
		Student s1=si.editdata(s);
		if(s1!=null)
		{
			Iterable<Student> s2 = si.getAllData();
			m.addAttribute("s",s1);
			return "update";
		}
		else
		{
			Iterable<Student> s2=si.getAllData();
			m.addAttribute("data",s2);
			return "Success";
		}
	}
	
	@RequestMapping("/update")
	public String updatedat(@ModelAttribute ("student") Student s,Model m)
	{
		System.out.println("In update method");
		
		si.save(s);
		Iterable<Student> s2 = si.getAllData();
		m.addAttribute("data",s2);
		return "Success";
	}
}
