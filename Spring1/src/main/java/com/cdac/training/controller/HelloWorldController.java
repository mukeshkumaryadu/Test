package com.cdac.training.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/*
 * Client =--> Request (GET/POST)-->Front Controller(web.xml) Uses spring web config file 
 * --->HelloWorldController-->Find Mapping method-->return views
 * */


@Controller
public class HelloWorldController {
  @GetMapping("/raj")
  public String sayHello() {
  return "hello";//return view hello.jsp
  }
  @GetMapping("/cdac")
  public String sayHello1() {
  return "training";//return view trainig.jsp
  }
}
