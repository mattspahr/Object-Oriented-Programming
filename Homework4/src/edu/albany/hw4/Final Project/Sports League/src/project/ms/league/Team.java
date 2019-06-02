package project.ms.league;

import java.util.ArrayList;
import java.util.Hashtable;

import project.ms.league.event.game.*;
import project.ms.person.employee.teamemployee.Coach;
import project.ms.person.player.Player;

public class Team {

	private String teamName;
	private String city;
	private int wins;
	private int losses;
	private ArrayList<Coach> coachingStaff;
	private ArrayList<Player> roster;
	private ArrayList<Championship> championships;
	
	// True represents a Win and False represents a Loss
	private Hashtable<Game, Boolean> teamSchedule;
	
	
	public Team() { }
	
	public Team(String city, String teamName) {
		this.city = city;
		this.teamName = teamName;
		coachingStaff = new ArrayList<Coach>();
		roster = new ArrayList<Player>();
		championships = new ArrayList<Championship>(); 
		teamSchedule = new Hashtable<Game, Boolean>();
	}
	
	/*
	 * Team Info
	 */
	public String getTeamName() {
		return this.teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	/*
	 * Coaching Staff
	 */
	public ArrayList<Coach> getCoachingStaff() {
		return coachingStaff;
	}

	public void setCoachingStaff(ArrayList<Coach> coachingStaff) {
		this.coachingStaff = coachingStaff;
	}
	
	public void addCoach(Coach c) {
		this.coachingStaff.add(c);
	}
	
	public void removeCoach(Coach c) {
		this.coachingStaff.remove(c);
	}

	/*
	 * Players
	 */
	public ArrayList<Player> getRoster() {
		return roster;
	}

	public void setRoster(ArrayList<Player> roster) {
		this.roster = roster;
	}
	
	public void addPlayer(Player p) {
		roster.add(p);
	}
	
	public void removerPlayer(Player p) {
		roster.remove(p);
	}
	
	
	/*
	 * Championships
	 */
	public ArrayList<Championship> getChampionships() {
		return championships;
	}

	public void setChampionships(ArrayList<Championship> championships) {
		this.championships = championships;
	}

	/*
	 * Season Statistics
	 */
	
	// Goes through the league schedule and adds each game that the team is a part of. 
	public void setTeamSchedule(Schedule s) {
	
		for (int i = 0; i < 16; i++) {
			
			for (int j = 0; j < 16; j++) {
				Game g = s.getSchedule().get(i).get(j);
				
				if (this.teamName.equals(g.getAwayTeam().getTeamName()) || this.teamName.equals(g.getHomeTeam().getTeamName())) {
					teamSchedule.put(g, null);
					break;
				}	
			}	
		}
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}	
	
	public Hashtable<Game, Boolean> getTeamSchedule() {
		return teamSchedule;
	}

	public void updateRecord() {
				
		for (Game g : teamSchedule.keySet()) {
			if (g.getWinner().equals(this)) {
				teamSchedule.replace(g, true);
				incrementWins();
			} else {
				teamSchedule.replace(g, false);
				incrementLosses();
			}
		}		
	}
	
	public void incrementWins() {
		this.wins += 1;
	}
	
	public void incrementLosses() {
		this.losses += 1;
	}
	
	public String getRecord() {
		return String.valueOf(this.getWins()) + "-" + String.valueOf(this.getLosses());
	}
	
	public String toString() {
		return city + " " + teamName;
	}
}