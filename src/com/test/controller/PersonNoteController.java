package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="personNote")
public class PersonNoteController {
	@RequestMapping(value="")
     public String personNote(){
    	 return "personNote";
     }
}
