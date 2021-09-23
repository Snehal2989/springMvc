package com.cjc.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.Service.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bs;
	
	@RequestMapping("/findpriceById")
	public String getBook(@RequestParam("bid") String bid,Model m)
	{
		Double double1 = bs.findpriceById(bid);
	   m.addAttribute("msg1",double1);
		return "display";
	}

}
