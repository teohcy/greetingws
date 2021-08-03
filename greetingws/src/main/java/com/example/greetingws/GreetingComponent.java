package com.example.greetingws;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;



@Component
public class GreetingComponent {

	public String getMessage() {
		return "Hello from GreetingComponent";
		
	}
}
