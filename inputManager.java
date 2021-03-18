 /*
  * Hamadi Belghachi
  * Version 3, 2021.3.17
  * inputManager.java, code to parse an .xml file and create objects accordingly.
  * CSC 241
  */
 
/* To do:
 * Connect the rooms
 */

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

import java.util.ArrayList;

public class inputManager extends DefaultHandler {
	
	private Creature creatureCreator;
	public Room roomCreator;
	public static ArrayList <Room> est_Rooms = new ArrayList<>();
		
	public String name_Atbt;
	public String desc_Atbt;
	public String stat_Atbt;
	public String nrth_Atbt;
	public String east_Atbt;
	public String suth_Atbt;
	public String west_Atbt;
	public String last_room;
	
	@Override
	public void startDocument() {System.out.println("Started document parsing...\n");}

	@Override
	public void startElement(String unused, String unused2, String qName, Attributes attributes) {
		
		if (qName.equalsIgnoreCase("room")) {
			
			name_Atbt = attributes.getValue("name");
			desc_Atbt = attributes.getValue("description");
			stat_Atbt = attributes.getValue("state");
			nrth_Atbt = attributes.getValue("north");
			east_Atbt = attributes.getValue("east");
			suth_Atbt = attributes.getValue("south");
			west_Atbt = attributes.getValue("west");
			last_room = attributes.getValue("name");
			
			System.out.println( "Room " + 
								name_Atbt + ", " + desc_Atbt + ", " + stat_Atbt + ", " +
								nrth_Atbt + ", " + east_Atbt + ", " + suth_Atbt + ", " +
								west_Atbt);

			roomCreator = new Room(name_Atbt, desc_Atbt, stat_Atbt, nrth_Atbt, east_Atbt, suth_Atbt, west_Atbt);

			est_Rooms.add(roomCreator);
		
		} else if (qName.equalsIgnoreCase("animal")) {
			
			name_Atbt = attributes.getValue("name");
			desc_Atbt = attributes.getValue("description");

			System.out.println(name_Atbt + " of " + last_room + ", " + desc_Atbt);
								
			creatureCreator = new Animal(name_Atbt, desc_Atbt);
			
			roomCreator.addCreature(creatureCreator);

		} else if (qName.equalsIgnoreCase("npc")) {
			
			String name_Atbt = attributes.getValue("name");
			String desc_Atbt = attributes.getValue("description");
			
			System.out.println(name_Atbt + " of " + last_room + ", " + desc_Atbt);
								
			creatureCreator = new NPC(name_Atbt, desc_Atbt);
			
			roomCreator.addCreature(creatureCreator);
			
		} else if (qName.equalsIgnoreCase("pc")) {
			
			String name_Atbt = attributes.getValue("name");
			String description_Atbt = attributes.getValue("description");
			
			System.out.println("PC of " + last_room + ", " + desc_Atbt);								
			
			roomCreator.addCreature(creatureCreator);
			
		}
		
		
		
	}	
	
	@Override
	public void endDocument() {
		System.out.println("\nDocument parsing finished.");
		
		//Testing: System.out.println(roomCreator.toString());
		
	}
		

	
}
