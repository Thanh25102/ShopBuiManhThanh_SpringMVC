package com.buimanhthanh.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = {"/","/trang-chu"})
	public String index() {
		return "home/index";
	}

	@GetMapping(value={"/cart"})
	public String cart(){
		return "home/cart";
	}
	@GetMapping(value={"/checkout"})
	public String checkOut(){
		return "home/checkout";
	}
	@GetMapping(value={"/shop"})
	public String shop(){
		return "home/shop";
	}
	@GetMapping(value={"/product-detail"})
	public String productDetail(){
		return "home/single-product";
	}
}
