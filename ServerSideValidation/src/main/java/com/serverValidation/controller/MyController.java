package com.serverValidation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.serverValidation.entities.LoginData;

@Controller
public class MyController {
	@GetMapping("/showform")
	public String showForm(Model m) {
		
		m.addAttribute("login", new LoginData()); 
		return "registerForm";
	}
	//handler for processing form
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("login") LoginData logindata, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "registerForm";
		}
		System.out.println(logindata);
		return "success";
	}
}
