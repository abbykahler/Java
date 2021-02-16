package com.NinjaGold;


import java.util.ArrayList;
import java.util.Random;
import javax.servlet.http.HttpSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class NinjaGoldController {
	Random rand = new Random();
	public static void main(String[] args) {
		SpringApplication.run(NinjaGoldController.class, args);
	}
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("gold")==null || session.getAttribute("log")==null) {
			ArrayList<String> log = new ArrayList<String>();
			log.add(0,"<p>Started new game at 0 gold<p>");
			session.setAttribute("log",log);
			session.setAttribute("gold",0);
		}
		return "index.jsp";
	}
	
	@RequestMapping(value="process", method=RequestMethod.POST)
	public String process(@RequestParam(value="min") int min, @RequestParam(value="max") int max, @RequestParam(value="str") String str,@RequestParam(value="reset", defaultValue ="") String reset,HttpSession session,Model model) {
		if(reset.equals("reset")||session.getAttribute("gold")==null || session.getAttribute("log")==null) {
			session.invalidate();
			return "redirect:/";
		}
		@SuppressWarnings("unchecked")
		ArrayList<String> log = (ArrayList<String>) session.getAttribute("log");
		int x = rand.nextInt(max)+min;
		String win = "";
		String prefix = "";
		if(x>0) {
			win="earned "; 
			
		}
		else {
			win="earned "; 
			
		}
		String newlog =(prefix+str + win + x);
		log.add(0,newlog);
		session.setAttribute("log", log);
		model.addAttribute("gold");
		model.addAttribute("log");
		
		return "redirect:/";
		
	}
	
}
	