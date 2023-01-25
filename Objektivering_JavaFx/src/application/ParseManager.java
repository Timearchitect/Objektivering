package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParseManager {


	private String filePath;


	public ParseManager(String filePath) {
		super();
		this.filePath = filePath;
	}
	

	public String readFile() throws FileNotFoundException {

		File file = new File(filePath);
		
		String fileContent = "";

		Scanner scanner = new Scanner(file);
		
		while (scanner.hasNextLine()) {

			fileContent = fileContent.concat(scanner.nextLine());

		}

		return fileContent;
	}

	
}
