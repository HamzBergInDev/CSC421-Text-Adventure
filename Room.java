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
	
	// Initialize Room Name String
	private String room_Name;
	
	// Initialize Animal Array
	public Animal[] animals_Visiting = new Animal[10];
	
	// Initialize Room Object
	public Room(String room_Name) { this.room_Name = room_Name;	}	
	
	// 'Animal check' is used to look for null, 'Animal a' plugs one in.
	public void addAnimal(Animal a) {
				
		for (Animal check: animals_Visiting) {
			
			if (check == null) {
				
				check = a;
				
				break;
				
			}
			
		}
		
	}
	
	// 'String return_Value' takes in all visiting animals before being returned.
	public String toString() {
		
		String return_Value = "The Animals of " + room_Name + " are: ";
		
		for (Animal check: animals_Visiting) {
			
			if (!(check == null)) {
				
				return_Value += check;
				
			}
			
		}
		
		return return_Value;
		
	}		
 
  }