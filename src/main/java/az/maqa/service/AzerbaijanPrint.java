package az.maqa.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({ "aze", "default" })
@Primary
public class AzerbaijanPrint implements LanguagePrint {

	@Override
	public void print() {
		System.out.println("Salam");
	}

}
