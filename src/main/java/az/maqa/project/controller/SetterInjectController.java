package az.maqa.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import az.maqa.service.Print;

@Controller
public class SetterInjectController {

	private Print print;

	public Print getPrint() {
		return print;
	}

	@Autowired
	@Qualifier("pdfPrint")
	public void setPrint(Print print) {
		this.print = print;
	}

	public void print() {
		print.print();
	}

}
