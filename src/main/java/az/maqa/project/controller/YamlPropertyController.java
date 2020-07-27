package az.maqa.project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class YamlPropertyController {

	@Value("${folder.path.c.yaml}")
	private String FOLDER_PATH_YML;

	public void printFolderPathInYMLConfig() {
		System.out.println(FOLDER_PATH_YML);
	}

}
