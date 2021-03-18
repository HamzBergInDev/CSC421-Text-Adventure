 /*
  * Hamadi Belghachi
  * Version 3, 2021.3.17
  * Animal.java, code to create a Animal object.
  * CSC 241
  */
 
 public class Animal extends Creature{
	
	// Initialize Animal Properties
	private String animal_Name;
	private String animal_Description;
	
	// Initialize Room Visiting Reference
	public Room room_Visiting;
		
	// Initialize Animal Object
	public Animal(String animal_Name, String animal_Description) { 
	
		this.animal_Name = animal_Name;
		this.animal_Description = animal_Description;
	
	}
	 
	// Return String of Animal Name
	@Override
	public String toString () { return "Animal " + animal_Name + ", "; }
	
	// Moves objects to a new room
	// @Override
	public void roomChange() { }
	
 }