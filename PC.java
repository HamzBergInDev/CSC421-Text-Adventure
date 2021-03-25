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
	
	// Initialize Room Visiting Reference 
	public Room room_Visiting; 
	
	// Initialize PC Object
	public PC(String PC_Name, String PC_Description) { 
	
		this.PC_Name = PC_Name;
		this.PC_Description = PC_Description;
		this.PC_Respect = PC_Respect;
		
	}
	
	// Return String of PC Name
	@Override
	public String toString () { return "PC " + PC_Name + ", "; }
	
	// Moves objects to a new room
	@Override
	public void roomChange() { }
	
	// This is where the fun begins
	public static void play(Scanner s, ArrayList est_Rooms) {
		
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
				
				System.out.println("User asked to see, but they're blind.");
				System.out.println("Which room do you want to see?");
				command = s.nextLine();
				
				for (int i = 0; est_Rooms.size() > i; i++){
					
					//System.out.println("flag");
					System.out.println(est_Rooms.get(i).toString());
					
					if(command.equalsIgnoreCase(est_Rooms.get(i).toString())) {
						System.out.println(est_Rooms.get(i).toString());
						System.out.println("flag");
					}
				}
				
			} else if (command.equalsIgnoreCase("clean")) {
				
				System.out.println("User asked to clean, but it's too dirty.");
				
			} else if (command.equalsIgnoreCase("Dirty")) {
			
				System.out.println("User asked to dirty, but that would be rude.");
				
			} else if (command.equalsIgnoreCase("North")) {
			
				System.out.println("User asked to move north, but gave up.");
			
			} else if (command.equalsIgnoreCase("East")) {
			
				System.out.println("User asked to move east, but gave up.");
			
			} else if (command.equalsIgnoreCase("South")) {
				
				System.out.println("User asked to move south, but gave up.");
				
			} else if (command.equalsIgnoreCase("West")) {
				
				System.out.println("User asked to move west, but gave up.");
	
			} else if (command.equalsIgnoreCase("exit")) {
				
				System.out.println("See you next time!");
				System.exit(0);
				
			} else {
				
				System.out.println("What are you on about?");			
 
			}
			
			command = s.nextLine();
			
		}
	}
	
 }
 