package com.buimanhthanh.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	@GetMapping(value={"/admin/","/admin"})
	public String index(){
		return "adminIndex";
	}
	@GetMapping(value={"/admin/table"})
	public String table(){
		return "adminTable";
	}
}
