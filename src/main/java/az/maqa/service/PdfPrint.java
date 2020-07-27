package az.maqa.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PdfPrint implements Print {

	@Override
	public void print() {
		System.out.println("Pdf Print");
	}

}
