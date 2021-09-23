package com.cjc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value(value="${cjc.msg}")
	private String msg;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return msg;
	}
}
