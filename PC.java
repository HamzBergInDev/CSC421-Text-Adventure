 /*
  * Hamadi Belghachi
  * Version 3, 2021.3.17
  * PC.java, code to create a PC object.
  * CSC 241
  */
 
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
	
 }