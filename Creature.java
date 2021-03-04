/* Hamadi Belghachi
 * CSC 241, 3/2/2021
 * Homework 2 (Creature.java)
 */
 
 public abstract class Creature {
	
	// Pass to toString() in each child method
	public abstract String toString();
	
	// Performs changes to visiting room's state
	public final void stateChange() { }
	
	// Performs to see room_State change and notifies visitors
	public final void stateCheck() { }
	
	// Performs peer into a room's state
	public final void stateSee() { }
	
	// Pass to roomChange() in each child method
	public abstract void roomChange();
	
 }
 