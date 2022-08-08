package com.buimanhthanh.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
/*	@GetMapping(value = {"/","/trang-chu"})
	public String index() {
		return "admin/index";
	}*/


	@GetMapping(value={"/table"})
	public String productDetail(){
		return "admin/tables";
	}
}
