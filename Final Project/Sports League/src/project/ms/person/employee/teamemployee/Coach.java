package project.ms.person.employee.teamemployee;

import java.util.ArrayList;

import project.ms.league.Team;
import project.ms.person.employee.Employee;

/*
 * Coach class represents a coach of a team.
 */
public class Coach extends Employee<Team> {

	private double salary;
	private Team myTeam = null;
	private String coachType;
	private ArrayList<Team> employementHistory = new ArrayList<Team>();
	
	public Coach(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getCoachType() {
		return this.coachType;
	}
	
	public void setCoachType(String type) {
		this.coachType = type;
	}
	
	public Team getTeam() {
		return this.myTeam;
	}

	public void hired(Team newTeam) {
		if (this.myTeam == null) {
			this.myTeam = newTeam;
			this.employementHistory.add(newTeam);
			
		} else {
			this.fired();
			this.myTeam = newTeam;
			this.employementHistory.add(newTeam);
		}
	}
	
	public void fired() {
		if (this.myTeam != null) {
			this.myTeam = null;
		}
	}
	
	public ArrayList<Team> getEmployementHistory(){
		return this.employementHistory;
	}
	
	public void setEmployementHistory(ArrayList<Team> eHistory) {
		this.employementHistory = eHistory;
	}
	
	@Override
	public String toString() {
		if (myTeam == null) {
			return this.getName() + " | Unemployed";
		} else {
			return this.getName() + " | Coach of: " + this.getTeam();
		}
	}
	
}
