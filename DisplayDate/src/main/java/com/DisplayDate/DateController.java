package com.DisplayDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("date", new java.util.Date());
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("time", new java.util.Date());
		return "time.jsp";
	}
}
