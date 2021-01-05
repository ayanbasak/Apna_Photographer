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
import com.apna.photographer.completeDemo.entity.Photographer;
import com.apna.photographer.completeDemo.service.PhotographerService;

@Controller
@RequestMapping("/photographer")
public class PhotographerController {

	@Autowired
	private PhotographerService photographerService;

	@Autowired
	private EmailUtil emailUtil;

	public PhotographerController(PhotographerService thePhotographerService) {
		this.photographerService = thePhotographerService;
	}

	@GetMapping("/list")
	public String listPhotographer(Model theModel) {
		List<Photographer> thePhotographer = photographerService.findAll();
		theModel.addAttribute("photographer", thePhotographer);
		return "employees/list-photographer";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Photographer thePhotographer = new Photographer();
		theModel.addAttribute("photographer", thePhotographer);
		return "/ap/photographerRegForm";
	}

	@PostMapping("/save")
	public String savePhotographer(@ModelAttribute("photographer") Photographer thePhotographer) {

		emailUtil.sendEmail("ayanbasak9851@gmail.com", "A Photographer Registered",
				"\n name: " + thePhotographer.getFullName() + "\n email: " + thePhotographer.getEmail() + "\n number: "
						+ thePhotographer.getPhoneNo() + "\n location: " + thePhotographer.getLocation()
						+ "\n Experience: " + thePhotographer.getExperience() + "\n job type: "
						+ thePhotographer.getJobType() + "\n password: " + thePhotographer.getPassword());

		photographerService.save(thePhotographer);

		return "/ap/photographerConformationPage";
	}

	@GetMapping("/delete/{id}")
	public String deletePhotographer(@PathVariable int id) {
		photographerService.deleteById(id);
		return "redirect:/photographer/list";
	}
}
