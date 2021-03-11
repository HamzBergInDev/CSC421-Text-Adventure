/* Hamadi Belghachi
 * CSC 241, 2/28/2021
 * Homework 3 (Main.java)
 */
 

public class Main {
	
	public static void main(String[] args) {
		
		//Scans User Input
		Scanner scan = new Scanner(System.in);
		
		// Name Input Bloc
		String player_Name = "";
		System.out.println("What is the Player's name?");
		player_Name = scan.nextline();
		
		// File Input Bloc
		try {
			
			// Gets File
			File inputXML = new File("input.xml");
			
			// Enables SAX based parser to look through XML Files
			SAXParserFactory factoryParser = SAXParserFactory.newInstance();
			
			// Creates new SAX parser
			SAXParser saxParser = factoryParser.newSAXParser();
			
			// Creates inputManager instance
			inputManager input = new inputManager();
			
			// Parse Notice
			System.out.println("...Parsing Started");
			
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