package project.ms.person.employee.leagueemployee;

import project.ms.league.League;
import project.ms.person.employee.Employee;

public class Executive extends Employee<League>{
	private String jobTitle;
	
	public Executive(String firstName, String lastName, String jobTitle) {
		super(firstName, lastName);
		this.jobTitle = jobTitle;
	}
	
	public String getJobTitle() {
		return this.jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() {
		return this.getName() + " | " + this.jobTitle; 
	}
}