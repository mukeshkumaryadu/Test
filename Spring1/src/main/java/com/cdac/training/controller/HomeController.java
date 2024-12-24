package com.cdac.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
 @GetMapping("/spring1")
 public String getMethodname() {
 return "test";//return view test.jsp
 }
}
