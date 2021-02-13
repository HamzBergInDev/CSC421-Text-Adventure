/* Hamadi Belghachi
 * CSC 241, 2/4/2021
 * Homework 1 (Room.java)
 */
 
/* Notables:
 * > Room can contain ten Animals
 * > Each room must have a name
 * > Needs public toString() method
 */
 
 public class Room {
	 
	private String room_Name;
	
	public Animal[] animals_Visiting = new Animal[10];
 
	// Initialize Room Object
	public Room(String room_Name) { this.room_Name = room_Name;	}	
	
	public void addAnimal(Animal a) { 
	
		for (int i = 0; animals_Visiting.length > i; i++) {
			animals_Visiting[i] = a;
		}
		
	}
	
	// Return String
	public String toString() {
		
		return "The Animals of " + room_Name + " are: " + animals_Visiting.toString(); 
		
	}		
 
  }