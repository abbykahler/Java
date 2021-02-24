package com.DojosAndNinjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DojosAndNinjas.models.Dojo;
import com.DojosAndNinjas.models.Ninja;
import com.DojosAndNinjas.services.DojoService;
import com.DojosAndNinjas.services.NinjaService;

@Controller
public class MainController {
	
	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/")
	public String allDojos(Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "index.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String showDojoCreate(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}
		dojoService.save(dojo);
		return "redirect:/";
	}
	
	@GetMapping("/ninjas/new")
	public String showNinjaCreate(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "newNinja.jsp";
		}
		
		if(ninja.getDojo().getNinjas().size() > 10) {
			
		}else {
			
		}

		ninjaService.save(ninja);
		return "redirect:/";
	}
	@RequestMapping("/dojos/{id}")
	public String viewDojos(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoService.findByID(id);
		model.addAttribute("dojo", dojo);
		Ninja ninja = ninjaService.findByID(id);
		model.addAttribute("ninjas", ninja);
		return "dojos.jsp";
	}

}