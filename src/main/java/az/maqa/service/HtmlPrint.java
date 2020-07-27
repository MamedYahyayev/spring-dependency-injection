package az.maqa.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class HtmlPrint implements Print {

	@Override
	public void print() {
		System.out.println("Html print");
	}

}
