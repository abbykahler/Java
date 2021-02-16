package com.FamiliarWithRouting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@RequestMapping("/coding")
public class CodingController {
	// 1. Annotation
	
    @RequestMapping("")
    // 3. Method that maps to the request route above
    public String Dojo() { 
            return "Hello Coding Dojo!";
    }
    @RequestMapping("/python")
    // 3. Method that maps to the request route above
    public String python() { 
            return "Python/Django was awesome!";
    }
    @RequestMapping("/java")
    // 3. Method that maps to the request route above
    public String java() { 
            return "Java/Spring is better!'";
    }

}
