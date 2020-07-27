package az.maqa.project.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import az.maqa.service.HtmlPrint;
import az.maqa.service.Print;

@Controller
public class MyController {

	private Print print;

	public MyController(@Qualifier("htmlPrint") Print print) {
		this.print = print;
	}

	public void print() {
		print.print();
	}

}
