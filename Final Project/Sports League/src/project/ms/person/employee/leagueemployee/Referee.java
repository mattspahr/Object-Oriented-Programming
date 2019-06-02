package project.ms.person.employee.leagueemployee;

import project.ms.league.League;
import project.ms.person.employee.Employee;

public class Referee extends Employee<League> {
	
	private String jerseyNumber;
	
	public Referee(String firstName, String lastName, String jerseyNumber) {
		super(firstName, lastName);
		this.jerseyNumber = jerseyNumber;
	}
	
	public String getJerseyNumber() {
		return this.jerseyNumber;
	}
	
	public void setJerseyNumber(String jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	@Override
	public String toString() {
		return this.getName() + " | Referee";
	}
}
