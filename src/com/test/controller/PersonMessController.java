package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="personMess")
public class PersonMessController {
	@RequestMapping(value="")
    public String personMess(){
   	 return "personMess";
    }
}
