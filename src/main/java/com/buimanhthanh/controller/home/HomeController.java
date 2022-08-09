package com.buimanhthanh.controller.home;

import com.buimanhthanh.service.ProductImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@Autowired
	private ProductImagesService productImagesService;
	@GetMapping(value={"/"})
	public String index(){
		productImagesService.getAllProductImages().forEach(c-> System.out.println(c.toString()));
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
