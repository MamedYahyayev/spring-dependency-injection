package az.maqa.project.controller;

import org.springframework.stereotype.Controller;

import az.maqa.service.LanguagePrint;

@Controller
public class ProfileController {

	private LanguagePrint print;

	public ProfileController(LanguagePrint print) {
		this.print = print;
	}

	public void helloMessage() {
		print.print();
	}
	
}
