/* Hamadi Belghachi
 * CSC 241, 2/28/2021
 * Homework 3 (Room.java)
 */
 
public class inputManager extends DefaultManager {

	boolean bool_Room = false;
	boolean bool_Animal = false;
	boolean bool_NPC = false;
	boolean bool_PC = false;
	
	// Checks to see if XML document matches.
	@Override
	public void startElement (String tag_Query, Attributes get_Attributes) throws SAXException {
		
		if (tag_Query.equalsIgnoreCase("room") {
			
			bool_Room = true;
			
			String room_Name = get_Attributes.getValue("name");
			String room_Description = get_Attributes.getValue("description");
			String room_State = get_Attributes.getValue("state");
			String room_North = get_Attributes.getValue("north");
			String room_East = get_Attributes.getValue("east");
			String room_South = get_Attributes.getValue("south");
			String room_West = get_Attributes.getValue("west");
			
			System.out.println( "Room name: " + room_Name + 
								" Room Desc.: " + room_Description + 
								" Room State: " + room_State + 
								" Room North: " + room_North +
								" Room East: " + room_East +
								" Room South: " + room_South +
								" Room West: " + room_West );			
			
		} else if (tag_Query.equalsIgnoreCase("animal") {
			
			bool_Animal = true;
			String animal_Description = get_Attributes.getValue("description");
			
		} else if (tag_Query.equalsIgnoreCase("npc") {
			
			bool_NPC = true;
			String NPC_Description = get_Attributes.getValue("description");
			
		} else if (tag_Query.equalsIgnoreCase("pc") {
			
			bool_PC = true;
			String PC_Description = get_Attributes.getValue("description");
			
		}		
		
	}
	
	// Notifies when matching document
	public void endElement (String tag_Query) throws SAXException {
		
		if (tag_Query.equalsIgnoreCase("room")) {
			
			System.out.println("Boolean Parsing Complete");		
		
	}
	
	@Override
	public void characters (char ch[], int start, int length) throws SAXException {
		
		if (bool_Room) {
			
			// We need a method that takes the XML document and converts the tags into objects here.
			new Room(
		
	}

	
	
}