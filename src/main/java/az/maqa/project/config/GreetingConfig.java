package az.maqa.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import az.maqa.service.AzerbaijanGreeting;
import az.maqa.service.EnglishGreeting;
import az.maqa.service.Greeting;
import az.maqa.service.TurkishGreeting;

@Configuration
public class GreetingConfig {

	@Bean
	public AzerbaijanGreeting azerbaijanGreeting() {
		return new AzerbaijanGreeting();
	}

	@Bean
	public EnglishGreeting englishGreeting() {
		return new EnglishGreeting();
	}

	// XML config
//	@Bean
//	public TurkishGreeting turkishGreeting() {
//		return new TurkishGreeting();
//	}
	

}
