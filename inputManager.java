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
	
	private ArrayList<Room> est_Rooms = new ArrayList<Room>();
		
	public String name_Atbt;
	public String desc_Atbt;
	public String stat_Atbt;
	public String nrth_Atbt;
	public String east_Atbt;
	public String suth_Atbt;
	public String west_Atbt;
	public String last_Room;
	
	@Override
	public void startDocument() { System.out.println("Started document parsing...\n"); }

	@Override
	public void startElement(String unused, String unused2, String qName, Attributes attributes) {
		
		if (qName.equalsIgnoreCase("room")) {
			
			name_Atbt = attributes.getValue("name");
			desc_Atbt = attributes.getValue("description");
			stat_Atbt = attributes.getValue("state");
			
			roomCreator = new Room(name_Atbt, desc_Atbt, stat_Atbt, null, null, null, null);
			
			est_Rooms.add(roomCreator);
			
			last_Room = attributes.getValue("name");

		} else if (qName.equalsIgnoreCase("animal")) {
			
			name_Atbt = attributes.getValue("name");
			desc_Atbt = attributes.getValue("description");

			creatureCreator = new Animal(name_Atbt, desc_Atbt);
			
			roomCreator.addCreature(creatureCreator);

		} else if (qName.equalsIgnoreCase("npc")) {
			
			name_Atbt = attributes.getValue("name");
			desc_Atbt = attributes.getValue("description");
								
			creatureCreator = new NPC(name_Atbt, desc_Atbt);
			
			roomCreator.addCreature(creatureCreator);
			
		} else if (qName.equalsIgnoreCase("pc")) {
			
			name_Atbt = attributes.getValue("name");
			desc_Atbt = attributes.getValue("description");
						
			roomCreator.addCreature(creatureCreator);
			this.player = new PC(name_Atbt, desc_Atbt, roomCreator);
			
		} 
		
		if (qName.equalsIgnoreCase("room")) {
			
			name_Atbt = attributes.getValue("name");
			nrth_Atbt = attributes.getValue("north");
			east_Atbt = attributes.getValue("east");
			suth_Atbt = attributes.getValue("south");
			west_Atbt = attributes.getValue("west");
			
			for (int i = 0; est_Rooms.size() > i; i++) {
				
				if (est_Rooms.get(i).getRoomName().equalsIgnoreCase(name_Atbt)) {
					
					for (int e = 0; est_Rooms.size() > e; e++) {
						
						if (est_Rooms.get(e).getRoomName().equalsIgnoreCase(nrth_Atbt)){
							
							est_Rooms.get(e).north_Neighbor(est_Rooms.get(i));							
						
						} else if (est_Rooms.get(e).getRoomName().equalsIgnoreCase(east_Atbt)) {
							
							est_Rooms.get(e).east_Neighbor(est_Rooms.get(i));
							
						} else if (est_Rooms.get(e).getRoomName().equalsIgnoreCase(suth_Atbt)) {
							
							est_Rooms.get(e).south_Neighbor(est_Rooms.get(i));
							
						} else if (est_Rooms.get(e).getRoomName().equalsIgnoreCase(west_Atbt)) {
							
							est_Rooms.get(e).west_Neighbor(est_Rooms.get(i));

						}							
					}				
				}		
			}
		}		
	}
		
		

	public PC getPC() { return player; }
	
	@Override
	public void endDocument() {	
	
		System.out.println("\nDocument parsing finished.");
		//System.out.println("\n" + est_Rooms + "\n");
		
		
	}
		

	
}
