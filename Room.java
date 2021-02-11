/* Hamadi Belghachi
 * CSC 241, 2/4/2021
 * Homework 1 (Room.java)
 */
 
/* Notables:
 * > Room can contain ten Animals
 * > Each room must have a name
 * > Needs public toString() method
 */
 
 import java.util.ArrayList;
 
 public class room {
	 
	private String room_Name;
	
	private ArrayList<String> animals_Visiting = new ArrayList<>();
 
	// Initialize Room Object
	public Room(String room_Name) { this.room_Name = room_Name;	}	
	
	public void addAnimal(Animal a) { 
	
		Animal a = new Animal(this);
		
		if (animals_Visiting.size <= 10) { animals_Visiting.add(a); }

	}
	
	// Return String
	public String toString() {
		
		return "The Animals of " + room_Name + " are: " + animals_Visiting.toString(); 
		
	}		
 
  }