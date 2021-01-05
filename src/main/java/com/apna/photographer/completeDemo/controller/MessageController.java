package com.apna.photographer.completeDemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apna.photographer.completeDemo.entity.Message;

import com.apna.photographer.completeDemo.service.MessageService;

@Controller
@RequestMapping("/message")
public class MessageController {

	private MessageService messageService;

	public MessageController(MessageService theMessageService) {
		this.messageService = theMessageService;
	}

	@GetMapping("/list")
	public String listMessage(Model theModel) {
		List<Message> theMessage = messageService.findAll();
		theModel.addAttribute("message", theMessage);
		return "employees/list-message";
	}

	@PostMapping("/save")
	public String saveMessage(@ModelAttribute("message") Message theMessage) {
		messageService.save(theMessage);
		return "ap/index";
	}

}
