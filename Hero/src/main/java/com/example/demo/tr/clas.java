package com.example.demo.tr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clas {

	   @RequestMapping("web/try/hii")
	   String m2() {
		   return "Hero"
		   +"<br> Where are you";
	   }
}
