package com.buimanhthanh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = {"/","/trang-chu"})
	public String index() {
		return "index";
	}

	@GetMapping(value={"/cart"})
	public String cart(){
		return "cart";
	}@GetMapping(value={"/checkout"})
	public String checkOut(){
		return "checkout";
	}
}
