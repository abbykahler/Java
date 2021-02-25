package com.dojo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo.models.License;
import com.dojo.models.Person;
import com.dojo.services.LicenseService;
import com.dojo.services.PersonService;

@Controller
public class MainController {
	@Autowired
	private PersonService personService;
	@Autowired
	private LicenseService licenseService;
	
	public MainController(PersonService ps, LicenseService ls) {
		this.personService = ps;
		this.licenseService = ls;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		List<Person> persons = personService.findAllPersons();
		model.addAttribute("persons", persons);
		return "index.jsp";
	}
	
	@GetMapping("/persons/{id}")
	public String showPerson(@PathVariable Long id, Model model) {
		Person person = personService.findPerson(id);
		model.addAttribute("person", person);
		return "showPerson.jsp";
	}
	
	@GetMapping("/persons/new")
	public String newPersonForm(@ModelAttribute("person") Person person) {
		return "newPerson.jsp";
	}
	
	@PostMapping("/persons/new")
	public String newPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Error creating a person");
			return "redirect:/persons/new";
		} else {
			personService.createPerson(person);
			return "redirect:/persons/" + person.getId();
		}
	}
	
	@GetMapping("/licenses/new")
	public String newLicenseForm(@ModelAttribute("license") License license, Model model) {
		List<Person> persons = personService.findAllPersons();
		model.addAttribute("persons", persons);
		return "newLicense.jsp";
	}
	
	@PostMapping("/licenses/new")
	public String newLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Error creating a license");
			return "redirect:/licenses/new";
		} else {
			license.setNumber(String.format("%05d", license.getPerson().getId()));
			licenseService.createLicense(license);
			return "redirect:/persons/" + license.getPerson().getId();
		}
	}
}
