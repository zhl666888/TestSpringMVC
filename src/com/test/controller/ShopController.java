package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="shop")
public class ShopController {
	@RequestMapping(value="")
     public String shopView(){
    	 return "viewShop";
     }
}
