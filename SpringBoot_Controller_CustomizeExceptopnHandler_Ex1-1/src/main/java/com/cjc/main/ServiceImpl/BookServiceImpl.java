package com.cjc.main.ServiceImpl;

import org.springframework.stereotype.Service;

import com.cjc.main.Exception.BooknotFound;
import com.cjc.main.Service.BookService;


@Service

public class BookServiceImpl implements BookService {
	
	public Double findpriceById(String bid)
	{
		if(bid.equals("B101"))
		{
			return 450.00;
		}
		else
		{
			throw new BooknotFound("Plz enter the valid Id,current book is not available");
		}
		
		
	}

}
