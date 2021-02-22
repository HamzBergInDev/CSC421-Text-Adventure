/* Hamadi Belghachi
 * CSC 241, 2/4/2021
 * Homework 1 (Animal.java)
 */
 
/* Notables:
 * > Room can contain ten Animals
 * > Animal must have a name
 * > Needs public toString() method
 */
 
 public class Animal {
	
	// Initialize Animal Name String
	private String animal_Name;
	
	// Initialize Room Visiting Reference 
	public Room room_Visiting; 
	
	// Initialize Animal Object
	public Animal(String animal_Name) { this.animal_Name = animal_Name; }
	 
	// Return String of Animal Name	 
	public String toString () { 
	
		return "Animal " + animal_Name + ", "; 
		
	}
	 
 }