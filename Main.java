/* Hamadi Belghachi
 * CSC 241, 2/28/2021
 * Homework 3 (Main.java)
 */

import javax.xml.parsers.*;
import java.io.File;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		//Scans User Input
		Scanner scan = new Scanner(System.in);
		
		// Name Input Bloc
		System.out.println("What is the Player's name?");
		String player_Name = scan.nextLine();
		
		// File Input Bloc
		try {
			
			// Gets File
			File inputXML = new File("input.xml");			
			// Enables SAX based parser to look through XML Files
			SAXParserFactory factoryParser = SAXParserFactory.newInstance();
			SAXParser saxParser = factoryParser.newSAXParser();
			
			// Creates inputManager instance
			inputManager input = new inputManager();
			
			// Parses info
			saxParser.parse(inputXML, input);
			
		} catch (Exception error){
			
			// Details where the error specifically is
			error.printStackTrace();
			System.out.println("Something failed, look above!");
			
		}
		
		// Room Query Bloc
		String room_Query = "";
		System.out.println("What room do you need info on?");
		room_Query = scan.nextLine();
		// Missing code to request information from room.
		
	}
	
}