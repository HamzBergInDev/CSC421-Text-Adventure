 /*
  * Hamadi Belghachi
  * Version 3, 2021.3.17
  * NPC.java, code to create an NPC object.
  * CSC 241
  */
 
 public class NPC extends Creature {
	
	// Initialize NPC Properties
	private String NPC_Name;
	private String NPC_Description;
	
	// Initialize Room Visiting Reference 
	public Room room_Visiting; 
		 
	// Initialize NPC Object 
	public NPC (String NPC_Name, String NPC_Description) { 
	
		this.NPC_Name = NPC_Name;
		this.NPC_Description = NPC_Description;

	}	
	
	// Return String of NPC Name
	@Override
	public String toString () { return "NPC " + NPC_Name + ", "; }
	
	// Moves objects to a new room
	@Override
	public void roomChange() { }
	
 }