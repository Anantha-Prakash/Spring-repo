package com.test;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/register")
	public String showForm(Model model, User user)
	{
		model.addAttribute("user", user);
		return "registration_form";
	}
	
	@PostMapping("/register")
	public String submitForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model)
	{
		if(bindingResult.hasErrors())
		{
			return "registration_form";
		}
		return "registration_success";
	}
}
