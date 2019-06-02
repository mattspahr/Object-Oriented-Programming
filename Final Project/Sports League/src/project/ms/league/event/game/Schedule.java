package project.ms.league.event.game;

import java.util.ArrayList;

/*
 * Data Structure that is a 2D-ArrayList.
 * 	- Outer ArrayList represents each week.
 *  - ArrayLists stored at each index are lists of games for that week.
 */
public class Schedule {

	private ArrayList<ArrayList<Game>> schedule;
	
	public Schedule() {
		
		this.schedule = new ArrayList<ArrayList<Game>>();
		
		for (int i = 0; i < 16; i++) {
			ArrayList<Game> week = new ArrayList<>();
			schedule.add(week);
			for (int j = 0; j < 16; j++) {
				schedule.get(i).add(new Game());
			}
		}
		
	}
	
	public ArrayList<ArrayList<Game>> getSchedule() {
		return schedule;
	}

	public void setSchedule(ArrayList<ArrayList<Game>> schedule) {
		this.schedule = schedule;
	}
}