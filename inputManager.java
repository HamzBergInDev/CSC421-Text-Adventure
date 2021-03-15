/* Hamadi Belghachi
 * CSC 241, 2/28/2021
 * Homework 3 (inputManager.java)
 */

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

public class inputManager extends DefaultHandler {
	
	public String name_Atbt;
	public String desc_Atbt;
	public String stat_Atbt;
	public String nrth_Atbt;
	public String east_Atbt;
	public String suth_Atbt;
	public String west_Atbt;
	public String last_room;

	// notifies start of parsing
	@Override
	public void startDocument() { System.out.println("Started document parsing..."); }

	// parsing brain
	@Override
	public void startElement (String tag_Query, Attributes get_Attributes) {
		
		// gets, prints, and creates room
		if (tag_Query.equalsIgnoreCase("room")) {
			
			name_Atbt = get_Attributes.getValue("name");
			desc_Atbt = get_Attributes.getValue("description");
			stat_Atbt = get_Attributes.getValue("state");
			nrth_Atbt = get_Attributes.getValue("north");
			east_Atbt = get_Attributes.getValue("east");
			suth_Atbt = get_Attributes.getValue("south");
			west_Atbt = get_Attributes.getValue("west");
			last_room = get_Attributes.getValue("name");
			
			System.out.println( name_Atbt + ", " + desc_Atbt + ", " + stat_Atbt + ", " +
								nrth_Atbt + ", " + east_Atbt + ", " + suth_Atbt + ", " +
								west_Atbt );

			new Room(name_Atbt);
		
		// gets, prints, and creates animal
		} else if (tag_Query.equalsIgnoreCase("animal")) {
			
			name_Atbt = get_Attributes.getValue("name");
			desc_Atbt = get_Attributes.getValue("description");


			System.out.println(name_Atbt + " of " + last_room + ", " + desc_Atbt);
								
			new Animal(name_Atbt);
			
		// gets, prints, and creates NPC
		} else if (tag_Query.equalsIgnoreCase("npc")) {
			
			String name_Atbt = get_Attributes.getValue("name");
			String desc_Atbt = get_Attributes.getValue("description");
			
			System.out.println(name_Atbt + " of " + last_room + " , " + desc_Atbt);
								
			new NPC(name_Atbt);
			
		// gets, prints, and creates PC
		} else if (tag_Query.equalsIgnoreCase("pc")) {
			
			String name_Atbt = get_Attributes.getValue("name");
			String description_Atbt = get_Attributes.getValue("description");
			
			System.out.println("PC of " + last_room + ", " + desc_Atbt);								
			
		}		
		
	}	
	
	// notifies end of parsing
	@Override
	public void endDocument() { System.out.println("Document parsing finished."); }

	
}
