/* Hamadi Belghachi
 * CSC 241, 2/4/2021
 * Homework 1 (Room.java)
 */
 
/* Notables:
 * > Room can contain ten Animals
 * > Each room must have a name
 * > Needs public toString() method
 */
 
 import java.util.Arrays;
 
 public class Room {
	 
	private String room_Name;
	
	public Animal[] animals_Visiting = new Animal[10];
	
	private boolean spot_Found = false; 
 
	// Initialize Room Object
	public Room(String room_Name) { this.room_Name = room_Name;	}	
	
	// wrong
	public void addAnimal(Animal a) {
		
		// This method has to be able to find holes (null) and plug them in with animals
		// as well as block any attempts to overwrite one animal with another animal
		// as well as only add one animal and then stop.
		
		while (spot_Found == false) {
			
			for (int i = 0; animals_Visiting.length > i; i++) {
			
				if (animals_Visiting[i] == null) {
				
				animals_Visiting[i] = a;
			
				spot_Found = true;
			
				} 
			
			}
			
		}
		
		spot_Found = false;
		
	}
	
	// Return String wrong
	public String toString() {
		
		return "The Animals of " + room_Name + " are: " + Arrays.toString(animals_Visiting); 
		//This method needs to connect to individual animals and print them out.
		// like animals_Visiting[0].toString() 
		
	}		
 
  }