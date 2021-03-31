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

import java.util.*;

public class inputManager extends DefaultHandler {
	
	private Creature creatureCreator;
	private Room roomCreator;
	private PC player;

	String read_out = "";
		
	public String name_Atbt;
	public String desc_Atbt;
	public String stat_Atbt;
	public Room nrth_Atbt;
	public Room east_Atbt;
	public Room suth_Atbt;
	public Room west_Atbt;
	public String last_room;
	
	@Override
	public void startDocument() { System.out.println("Started document parsing...\n"); }

	@Override
	public void startElement(String unused, String unused2, String qName, Attributes attributes) {
		
		if (qName.equalsIgnoreCase("room")) {
			
			name_Atbt = attributes.getValue("name");
			desc_Atbt = attributes.getValue("description");
			stat_Atbt = attributes.getValue("state");

			last_room = attributes.getValue("name");
			
			read_out += "Room " + 
						name_Atbt + ", " + desc_Atbt + ", " + stat_Atbt + ", " +
						nrth_Atbt + ", " + east_Atbt + ", " + suth_Atbt + ", " +
						west_Atbt + "\n";

			roomCreator = new Room(name_Atbt, desc_Atbt, stat_Atbt, 
								   null, null, null, null);

		} else if (qName.equalsIgnoreCase("animal")) {
			
			name_Atbt = attributes.getValue("name");
			desc_Atbt = attributes.getValue("description");

			read_out += name_Atbt + " of " + last_room + ", " + desc_Atbt + "\n";
								
			creatureCreator = new Animal(name_Atbt, desc_Atbt);
			
			roomCreator.addCreature(creatureCreator);

		} else if (qName.equalsIgnoreCase("npc")) {
			
			name_Atbt = attributes.getValue("name");
			desc_Atbt = attributes.getValue("description");
			
			read_out += name_Atbt + " of " + last_room + ", " + desc_Atbt + "\n";
								
			creatureCreator = new NPC(name_Atbt, desc_Atbt);
			
			roomCreator.addCreature(creatureCreator);
			
		} else if (qName.equalsIgnoreCase("pc")) {
			
			name_Atbt = attributes.getValue("name");
			desc_Atbt = attributes.getValue("description");
			
			read_out += "PC of " + last_room + ", " + desc_Atbt + "\n";
						
			roomCreator.addCreature(creatureCreator);
			this.player = new PC(name_Atbt, desc_Atbt, roomCreator);
			
		}
		
		//System.out.println(read_out);
		
	}

	public PC getPC() { return player; }
	
	@Override
	public void endDocument() {	System.out.println("\nDocument parsing finished."); }
		

	
}
