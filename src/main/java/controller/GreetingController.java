package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping("/greeting")
	public String getGreeting() {
		return "Good Day Welcome To My Simple SpringBoot Application";
	}
}
 