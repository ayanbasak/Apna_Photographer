package com.apna.photographer.completeDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apna.photographer.completeDemo.email.EmailUtil;
import com.apna.photographer.completeDemo.entity.User;
import com.apna.photographer.completeDemo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private EmailUtil emailUtil;

	public UserController(UserService theUserService) {
		this.userService = theUserService;
	}

	@GetMapping("/list")
	public String listUser(Model theModel) {
		List<User> theUser = userService.findAll();
		theModel.addAttribute("user", theUser);
		return "employees/list-user";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		User theUser = new User();
		theModel.addAttribute("user", theUser);
		return "/ap/userRegForm";
	}

	@PostMapping("/save")
	public String saveUser(@ModelAttribute("user") User theUser) {

		emailUtil.sendEmail("ayanbasak9851@gmail.com", "A User Registered",
				"\n name: " + theUser.getFullName() + "\n email: " + theUser.getEmail() + "\n number: "
						+ theUser.getPhoneNo() + "\n location: " + theUser.getLocation() + "\n Budget: "
						+ theUser.getBudget() + "\n Ocation Date: " + theUser.getOcDate() + "\n need for: "
						+ theUser.getNeed() + "\n password: " + theUser.getPassword());

		userService.save(theUser);

		return "ap/userConformationPage";
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		userService.deleteById(id);
		return "redirect:/user/list";
	}
}
