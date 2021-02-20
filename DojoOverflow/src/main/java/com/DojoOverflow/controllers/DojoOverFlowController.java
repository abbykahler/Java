package com.DojoOverflow.controllers;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DojoOverflow.models.Questions;
import com.DojoOverflow.services.DojoOverflowService;

@Controller
@RequestMapping("/questions")
public class DojoOverFlowController {
	private final DojoOverflowService dojoOverflowService;
	
	public DojoOverFlowController(DojoOverflowService dojoOverflowService) {
		this.dojoOverflowService = null;
	}
	
	@RequestMapping("/")
	public String dashboard(Model model) {
		List<Questions> questions = dojoOverflowService.allQuestions();
		model.addAttribute("questions", questions);
		return "index.jsp";
	}
	
	@RequestMapping("/new")
	public String createQuestion(Model model, @ModelAttribute("createquestion") Question createquestion) {
		model.addAttribute("createquestion", createquestion);
		return "new.jsp";
	}
	
	
	}
