package com.apna.photographer.completeDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.apna.photographer.completeDemo.entity.Message;

@Controller
public class DemoController {
	
	@GetMapping("/home")
	public String sayHello(Model theModel) {
		Message theMessage = new Message();
		theModel.addAttribute("message", theMessage);
		return "ap/index";
	}
	
	@GetMapping("/")
	public String returnHome() {
		return "redirect:/home";
	}

}
