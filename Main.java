 /*
  * Hamadi Belghachi
  * Version 3, 2021.3.17
  * Main.java, Main java file to execute all code.
  * CSC 241
  */

import javax.xml.parsers.*;
import java.io.File;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("What is the Player's name?");
		String player_Name = scan.nextLine();

		try {

			System.out.println("What is the name of your game data file?");
			String inputFileName = scan.nextLine(); //"input";
			if ((inputFileName.length() > 4) && !(inputFileName.charAt(inputFileName.length() - 4) == '.')) 
				 {inputFileName += ".xml";}
			
			System.out.println("Loading " + inputFileName + "...");

			File inputXML = new File(inputFileName);
			SAXParserFactory factoryParser = SAXParserFactory.newInstance();
			SAXParser saxParser = factoryParser.newSAXParser();
			
			inputManager input = new inputManager();
			saxParser.parse(inputXML, input);
			
		} catch (SAXException error){

			error.printStackTrace();
			System.out.println("Contents justify invaild XML file.");
			
		} catch (ParseConfigurationException parseError){
			
			parseError.printStackTrace();
			System.out.println("XML parsing system error.");
				
	}
	
}