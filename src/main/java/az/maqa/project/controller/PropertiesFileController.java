package az.maqa.project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;

@Controller
@PropertySources({ @PropertySource("classpath:example1.properties"), @PropertySource("classpath:example2.properties") })
public class PropertiesFileController {

	@Value("${folder.path.c}")
	private String FOLDER_PATH_C;

	@Value("${folder.path.d}")
	private String FOLDER_PATH_D;

	public void printFolderPath() {

		System.out.println(FOLDER_PATH_C);
		System.out.println(FOLDER_PATH_D);

	}

}
