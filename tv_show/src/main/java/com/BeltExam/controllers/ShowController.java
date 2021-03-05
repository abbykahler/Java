package com.BeltExam.controllers;

import javax.servlet.http.HttpSession;
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

import com.BeltExam.models.Show;
import com.BeltExam.models.User;
import com.BeltExam.services.ShowsService;
import com.BeltExam.services.UserService;



@Controller
public class ShowController {
	
	@Autowired
	private ShowsService showsService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/shows")
	public String allShows(HttpSession session, Model model) {
		Long userId = (Long) session.getAttribute("userId");
		if(userId != null) {
    		User loggedInUser = userService.findUserById(userId);
    		model.addAttribute("user", loggedInUser);
    	}
		model.addAttribute("shows", showsService.allShows());
		return "shows.jsp";
		
	}
		
	@GetMapping("/shows/new")
	public String showCreateShow(@ModelAttribute("show") Show show, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if(userId != null) {
    		User loggedInUser = userService.findUserById(userId);
    		model.addAttribute("user", loggedInUser);
    	}
		else {
		}
		return "newShow.jsp";
	}
	
	@PostMapping("/createShow")
	public String createShow(@Valid @ModelAttribute("show") Show show, BindingResult result) {
		if(result.hasErrors()) {
			return "newShow.jsp";
        }
		showsService.save(show);
		return "redirect:/shows";
	}
	
	@PostMapping("/shows/rate/{id}")
	public String rateShow(@Valid @ModelAttribute("show") Show show, @PathVariable("id") Long id, BindingResult result) {
		if(result.hasErrors()) {
			return String.format("redirect:/shows/{id}", id);
        }
		showsService.save(show);
		return "redirect:/shows";
	}

	@RequestMapping("/shows/update/{id}")
	public String updateShow(@Valid @ModelAttribute("show") Show show, BindingResult result,  HttpSession session) {
		if(result.hasErrors()) {
			return "editShow.jsp";
        }
		showsService.save(show);
		return "redirect:/shows";
	}

	
	@RequestMapping("/shows/edit/{id}")
	public String editShow(@PathVariable("id") Long id, Model model) {
		Show shows = showsService.findShowbyID(id);
		model.addAttribute("show", shows);
		return "editShow.jsp";
	}
	
	@RequestMapping("/shows/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		showsService.deleteShow(id);
		return "redirect:/shows";
	}
	
	@RequestMapping("/shows/{id}")
	public String show(@PathVariable("id") Long id, Model model, HttpSession session) {
		Show show = showsService.findShowbyID(id);
		model.addAttribute("user", show.getUser());
		model.addAttribute("show", show);
		return "/shows/specificShow.jsp";
	}
    
}
