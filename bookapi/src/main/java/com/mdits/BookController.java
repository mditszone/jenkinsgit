package com.mdits;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/book")
public class BookController {
	
	
	public class Axiscontroller {
		
		
		@GetMapping("/books")
		public String welcomemsg() {
			
			
			return "Reading books";
		}

	}
	
	

}
