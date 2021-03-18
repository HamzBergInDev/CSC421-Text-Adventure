 /*
  * Hamadi Belghachi
  * Version 3, 2021.3.17
  * Room.java, code to create a Room object.
  * CSC 241
  */
 
 public class Room {

	private String room_Name;
	private String room_Stat;
	private String room_Desc;

	public String room_Nrth;
	public String room_East;
	public String room_Suth;
	public String room_West;



	public Creature[] creatures_Visiting = new Creature[10];
	
	public Room(String room_Name, String room_Desc, String room_Stat, 
				String room_Nrth, String room_East, String room_Suth, 
				String room_West) {	
	
		this.room_Name = room_Name;
		this.room_Stat = room_Stat;
		this.room_Desc = room_Desc;
		
		this.room_Nrth = room_Nrth;
		this.room_East = room_East;
		this.room_Suth = room_Suth;
		this.room_West = room_West;
		
	}
	
	public String roomNameID (String room_Name) {
		
		return this.room_Name;
		
	}
	
	public void addCreature(Creature a) {
		
		int space_Check = 0;
				
		for (int i = 0; creatures_Visiting.length > i; i++) {			
			if (creatures_Visiting[i] == null) {				
				creatures_Visiting[i] = a;				
				break;				
			} else {				
				space_Check++;
				if (space_Check == 10) { System.out.println(a + "cannot visit. " + room_Name + " is full!"); }				
			}			
		}		
	}

	public String toString() {
		
		String return_Value = "Of room " + room_Name +
								", the neighboring rooms are: N: " + room_Nrth + 
								", E: " + room_East + 
								", S: " + room_Suth + 
								", W: " + room_West +
								". \nIn " + room_Name + ", the creatures visiting are: ";
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