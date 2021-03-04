/* Hamadi Belghachi
 * CSC 241, 3/2/2021
 * Homework 2 (PC.java)
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