/* Hamadi Belghachi
 * CSC 241, 2/4/2021
 * Homework 1 (Room.java)
 */
 
/* Notables:
 * > Room can contain ten Animals
 * > Each room must have a name
 * > Needs public toString() method
 */
 
 
 public class room {
	 
	private String room_Name;
	
	String[] animals_Visiting = new String[10];
 
	public Room(String room_Name) {
		
		this.room_Name = room_Name;
	 
	}	
	
	public String toString() {
		
		return "The Animals of " + room_Name + " are: " + animals_Visiting; 
		
	} 
		
 
  }