package com.BeltExam.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.BeltExam.models.User;
import com.BeltExam.services.UserService;
import com.BeltExam.validators.UserValidator;

@Controller
public class BeltController {
	
	@Autowired
    private UserService userService;
	
	@Autowired
    private UserValidator userValidator;
	
    @RequestMapping("/")
    public String registerForm(@ModelAttribute("user") User user) {
        return "LogReg.jsp";
    }
 
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        userValidator.validate(user, result);
        if(result.hasErrors()) {
            return "LogReg.jsp";
        }
        User u = userService.registerUser(user);
        session.setAttribute("userId", u.getId());
        
        return "redirect:/shows";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, 
    						@RequestParam("password") String password, 
    						Model model, 
    						HttpSession session, 
    						RedirectAttributes flashMessage) {
    	if(userService.authenticateUser(email, password)) {
    		User thisUser = userService.findByEmail(email);
    		session.setAttribute("userId", thisUser.getId());
    		return "redirect:/shows";
    	}
    	
    	flashMessage.addFlashAttribute("error", "Login failed");
    	return "redirect:/";
    }
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
        // redirect to login page
    	session.invalidate();
    	return "redirect:/";
    }

}
	
	
	
	
	

