package az.maqa.project.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import az.maqa.service.Greeting;

@Controller
public class GreetingController {

	private final Greeting greeting;

	public GreetingController(@Qualifier("azerbaijanGreeting") Greeting greeting) {
		this.greeting = greeting;
	}

	
	public void getGreetingMessage() {
		greeting.greeting();
	}
	
}
