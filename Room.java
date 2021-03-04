/* Hamadi Belghachi
 * CSC 241, 2/28/2021
 * Homework 2 (Room.java)
 */
 
/* Notables:
 * > Room can contain ten Animals
 * > Each room must have a name
 * > Needs public toString() method
 */
 
 public class Room {
	
	// Initialize Room Properties
	private String room_Name;
	public String room_State;
	private String room_Description;
	
	// Initialize Creature Array, takes Animal & NPC & PC
	public Creature[] creatures_Visiting = new Creature[10];
	
	// Initialize Room Object
	public Room(String room_Name, String room_Description) {	
	
		this.room_Name = room_Name;
		this.room_State = room_State;
		this.room_Description = room_Description;
		
	}	
	
	// Initialize Cardinal Room References
	public Room room_North;
	public Room room_West;
	public Room room_South;
	public Room room_East;
		
	// For & If Loop are used to look for null, 'Creature a' plugs one in,
	// 'int space_Check' increments by 1 and leaves full message if
	// creatures_Visiting is full.
	public void addCreature(Creature a) {
		
		int space_Check = 0;
				
		for (int i = 0; creatures_Visiting.length > i; i++) {
			
			if (creatures_Visiting[i] == null) {
				
				creatures_Visiting[i] = a;
				
				break;
				
			} else {
				
				space_Check++;
				
				if (space_Check == 10) {
				
				System.out.println(a + "cannot visit. " + room_Name + " is full!");
			
				}				
				
			}			
			
		}
		
	}
	
	// 'String return_Value' takes in all visiting creatures before being returned.
	// 'boolean exist_Check' remains false if no Creature is in Array
	public String toString() {
		
		String return_Value = "In room " + room_Name + ", the creatures visiting are: ";
		
		boolean exist_Check = false;
		
		for (int i = 0; creatures_Visiting.length > i; i++) {
			
			if (!(creatures_Visiting[i] == null)) {
				
				return_Value += creatures_Visiting[i].toString();
				
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