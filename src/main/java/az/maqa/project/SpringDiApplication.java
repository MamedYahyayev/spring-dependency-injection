package az.maqa.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


import az.maqa.project.controller.GreetingController;
import az.maqa.project.controller.MyController;
import az.maqa.project.controller.ProfileController;
import az.maqa.project.controller.PropertiesFileController;
import az.maqa.project.controller.SetterInjectController;
import az.maqa.project.controller.YamlPropertyController;
import az.maqa.service.AzerbaijanGreeting;
import az.maqa.service.EnglishGreeting;
import az.maqa.service.TurkishGreeting;

// @Primary , @Qualifier , @Component , @Configuration , @Profile , XML Configuration , @ComponentScan , @Controller
// @Service , @AutoWired , @ImportResource , @PropertySource , @PropertySources , @Value , YAML Configuration

@SpringBootApplication
@ComponentScan(basePackages = { "az.maqa.service", "az.maqa.project" })
@ImportResource("bean-config.xml") // We import XML  file to Main Class when we want to use the Class with @ImportResource statement
public class SpringDiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		ApplicationContext applicationContext = (ApplicationContext) SpringApplication.run(SpringDiApplication.class,
				args);

		MyController controller = (MyController) applicationContext.getBean(MyController.class);
		controller.print();

		SetterInjectController setterInjectController = applicationContext.getBean(SetterInjectController.class);
		setterInjectController.print();

		ProfileController profileController = applicationContext.getBean(ProfileController.class);
		profileController.helloMessage();

		System.out.println("Greetings: ");
		AzerbaijanGreeting azerbaijanGreeting = applicationContext.getBean(AzerbaijanGreeting.class);
		azerbaijanGreeting.greeting();

		EnglishGreeting englishGreeting = applicationContext.getBean(EnglishGreeting.class);
		englishGreeting.greeting();

		System.out.print("Turkish Greeting From Xml File (bean-config.xml) :");
		TurkishGreeting turkishGreeting = applicationContext.getBean(TurkishGreeting.class);
		turkishGreeting.greeting();

		System.out.println("Azerbaijan Greetings from Greeting Controller: ");
		GreetingController greetingController = applicationContext.getBean(GreetingController.class);
		greetingController.getGreetingMessage();
		
		
		// Properties File 
		PropertiesFileController fileController = applicationContext.getBean(PropertiesFileController.class);
		fileController.printFolderPath();
		
		//Yaml Property File
		YamlPropertyController yamlPropertyController = applicationContext.getBean(YamlPropertyController.class);
		yamlPropertyController.printFolderPathInYMLConfig();

//		HtmlPrint htmlPrint = applicationContext.getBean(HtmlPrint.class);
//		htmlPrint.print();
//		
//		PdfPrint pdfPrint = applicationContext.getBean(PdfPrint.class);
//		pdfPrint.print();
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringDiApplication.class);
	}
}
