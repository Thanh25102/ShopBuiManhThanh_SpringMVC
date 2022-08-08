package com.buimanhthanh.controller.home;

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
	}
	@GetMapping(value={"/checkout"})
	public String checkOut(){
		return "checkOut";
	}
	@GetMapping(value={"/shop"})
	public String shop(){
		return "shop";
	}
	@GetMapping(value={"/product-detail"})
	public String productDetail(){
		return "detailProduct";
	}
}
