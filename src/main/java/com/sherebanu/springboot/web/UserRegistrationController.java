package com.sherebanu.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sherebanu.springboot.service.UserServiceImpl;
import com.sherebanu.springboot.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	@Autowired
	UserServiceImpl userService;
	
	@ModelAttribute("user")
	public UserRegistrationDto dto() {
		return new UserRegistrationDto();
	}
	
	@GetMapping
	public String showForm() {
		return "registration";
	}
	
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto dto) {
		userService.save(dto);
		return "redirect:/registration?success";
	}
}
