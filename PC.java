 /*
  * Hamadi Belghachi
  * Version 3, 2021.3.17
  * PC.java, code to create a PC object.
  * CSC 241
  */
 
 import java.util.*;
 
 public class PC extends Creature {
	
	// Initialize PC Properties
	private String PC_Name;
	private String PC_Description;
	private int PC_Respect = 40;
	private Room room_Visiting; 
	
	// Initialize PC Object
	public PC(String PC_Name, String PC_Description, Room room_Visiting) { 
	
		this.PC_Name = PC_Name;
		this.PC_Description = PC_Description;
		this.PC_Respect = PC_Respect;
		this.room_Visiting = room_Visiting;
		
	}
	
	// Return String of PC Name
	@Override
	public String toString () { return "PC " + PC_Name + ", "; }
	
	// Moves objects to a new room
	@Override
	public void roomChange() { }
	
	// This is where the fun begins
	public void play(Scanner s) {
		
		s = new Scanner(System.in);
		
		System.out.println("What do you want to do?");
		String command = s.nextLine();
		
		while (true) {
			
			if (command.equalsIgnoreCase("help")) {
				
				System.out.println("\nThe following commands are available to you:");
				System.out.println("- Help (Request List of Commands)");
				System.out.println("- Look (Display the contents and state of a room)");
				System.out.println("- Clean (Clean the room)");
				System.out.println("- Dirty (Dirty the room)");
				System.out.println("- North, East, South, West (Move in specified direction)");
				System.out.println("- Exit (Quit the game)\n");
				
			} else if (command.equalsIgnoreCase("look")) {
				
				System.out.println("\n" + room_Visiting.toString() + "\n");
				
			} else if (command.equalsIgnoreCase("clean")) {				
				
				room_Visiting.state_Change(command);
				System.out.println("\nUser cleaned the room! " + room_Visiting.getRoomName() + 
								   " is now " + room_Visiting.getRoomState() + ".\n");
				
			} else if (command.equalsIgnoreCase("dirty")) {
			
				room_Visiting.state_Change(command);
				System.out.println("\nUser dirtied the room! " + room_Visiting.getRoomName() +
								   " is now " + room_Visiting.getRoomState() + ".\n");
				
			} else if (command.equalsIgnoreCase("North")) {
			
				System.out.println("\nThe user has moved north to " + room_Visiting.getCardnialRoom(command) + ".\n");
				room_Visiting = room_Visiting.getCardnialRoom(command);
			
			} else if (command.equalsIgnoreCase("East")) {
			
				System.out.println("User asked to move east, but gave up.");
			
			} else if (command.equalsIgnoreCase("South")) {
				
				System.out.println("User asked to move south, but gave up.");
				
			} else if (command.equalsIgnoreCase("West")) {
				
				System.out.println("User asked to move west, but gave up.");
	
			} else if (command.equalsIgnoreCase("exit")) {
				
				System.out.println("\nSee you next time!");
				System.exit(0);
				
			} else {
				
				System.out.println("What are you on about?");			
 
			}
			
			System.out.println("What do you want to do?");
			command = s.nextLine();
			
		}
	}
	
 }
 