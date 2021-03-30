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
	
	public String getRoomName () { return this.room_Name; }
	
	public String getRoomState () { return this.room_Stat; }
	
	public String getCardnialRoom (String cardinal_Query) {
		
		if (cardinal_Query.equalsIgnoreCase("north")) {
			
			return this.room_Nrth;
			
		} else if (cardinal_Query.equalsIgnoreCase("east")) {
			
			return this.room_East;
			
		} else if (cardinal_Query.equalsIgnoreCase("south")) {
			
			return this.room_Suth;
			
		} else if (cardinal_Query.equalsIgnoreCase("west")) {
			
			return this.room_West;
			
		}
		
		return null;
		
	}		
	
	public String state_Change (String stat_change) {
		
		if (room_Stat.equalsIgnoreCase("clean") && stat_change.equalsIgnoreCase("clean")) {
			
			return this.room_Stat = "clean";
			
		} else if (room_Stat.equalsIgnoreCase("half-dirty") && stat_change.equalsIgnoreCase("clean")) {
			
			return this.room_Stat = "clean";
			
		} else if (room_Stat.equalsIgnoreCase("dirty") && stat_change.equalsIgnoreCase("clean")) {
			
			return this.room_Stat = "half-dirty";
			
		} 

		if (room_Stat.equalsIgnoreCase("clean") && stat_change.equalsIgnoreCase("dirty")) {
			
			return this.room_Stat = "half-dirty";
			
		} else if (room_Stat.equalsIgnoreCase("half-dirty") && stat_change.equalsIgnoreCase("dirty")) {
			
			return this.room_Stat = "dirty";
			
		} else if (room_Stat.equalsIgnoreCase("dirty") && stat_change.equalsIgnoreCase("dirty")) {
			
			return this.room_Stat = "dirty";
			
		}
		
		return null;
		
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
		
		return_Value += "\nThe room is " + room_Stat + ".";
 
	return return_Value;
 

	}
 }