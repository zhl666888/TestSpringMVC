package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="hello")
public class TestController {
	@RequestMapping(value="")
     public String hello(){
		return "welcome";
     }
}
