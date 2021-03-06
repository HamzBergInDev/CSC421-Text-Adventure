 /*
  * Hamadi Belghachi
  * Version 3, 2021.3.17
  * Main.java, Main java file to execute all code.
  * CSC 241
  */

import javax.xml.parsers.*;
import java.io.File;
import java.util.*;
import org.xml.sax.*;


public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("What is the Player's name?");
		String player_Name = scan.nextLine();

		try {

			System.out.println("What is the name of your game data file?");
			String inputFileName = scan.nextLine();
			if ((inputFileName.length() > 4) && !(inputFileName.charAt(inputFileName.length() - 4) == '.')) {
				inputFileName += ".xml";
			} else if (inputFileName.length() > 4) {
				inputFileName += ".xml";
			} else if (inputFileName.length() == 0) {
				inputFileName = "input.xml";
			}
			
			System.out.println("Loading " + inputFileName + "...");

			File inputXML = new File(inputFileName);
			SAXParserFactory factoryParser = SAXParserFactory.newInstance();
			SAXParser saxParser = factoryParser.newSAXParser();
			
			inputManager input = new inputManager();
			saxParser.parse(inputXML, input);
			
			
			
			
			PC fun = input.getPC();
			fun.play(scan);
			
		} catch (Exception error){

			error.printStackTrace();
			System.out.println("wrong");
			
		} 
		
		

	}
}