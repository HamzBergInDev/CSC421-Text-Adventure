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
	
	// For & If Loop are used to look for null, 'Animal a' plugs one in,
	// 'int space_Check' increments by 1 and leaves full message if
	// animals_Visiting is full.
	public void addAnimal(Animal a) {
		
		int space_Check = 0;
				
		for (int i = 0; animals_Visiting.length > i; i++) {
			
			if (animals_Visiting[i] == null) {
				
				animals_Visiting[i] = a;
				
				break;
				
			} else {
				
				space_Check++;
				
				if (space_Check == 10) {
				
				System.out.println(a + "cannot visit. " + room_Name + " is full!");
			
				}				
				
			}			
			
		}
		
	}
	
	// 'String return_Value' takes in all visiting animals before being returned.
	// 'boolean exist_Check' remains false if no Animal is in Array
	public String toString() {
		
		String return_Value = "In room " + room_Name + ", the animals visiting are: ";
		
		boolean exist_Check = false;
		
		for (int i = 0; animals_Visiting.length > i; i++) {
			
			if (!(animals_Visiting[i] == null)) {
				
				return_Value += animals_Visiting[i].toString();
				
				exist_Check = true;
				
			} else {				
				
				if (exist_Check == false) {
				
				return_Value += "no one's here.";
				
				break;
			
				}				
				
			}
			
		}
		
		return return_Value;
		
	}		
 
  }