package com.Language.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Language.models.Language;
import com.Language.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService languageService;
	
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@RequestMapping("/languages")
	public String index(@ModelAttribute("addNew") Language language, Model model) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	 @RequestMapping("/languages/new")
	    public String newLanguage(@ModelAttribute("language") Language language) {
	        return "/languages/index.jsp";
	 }

	@RequestMapping(value="/languages", method=RequestMethod.POST)
	public String add(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
        if (result.hasErrors()) {
    		List<Language> languages = languageService.allLanguages();
    		model.addAttribute("languages", languages);
            return "index.jsp";
        }
        else {
            languageService.addLanguage(language);
            return "redirect:/languages";
        }
	}
	@RequestMapping("/languages/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "edit.jsp";
	}
	@RequestMapping(value="/languages/{id}", method=RequestMethod.POST)
	public String update(@Valid @ModelAttribute("language") Language language, BindingResult result, String name, String creator, String currentVersion) {
        if (result.hasErrors()) {
            return "edit.jsp";
        }
        else {
            languageService.updateLanguage(language.getId(),name, creator, currentVersion);
            return "redirect:/languages/{id}";
        }
	}
	
	@RequestMapping("/languages/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "show.jsp";
	}

	@RequestMapping("/languages/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}


}