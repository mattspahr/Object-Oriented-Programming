package project.ms.league.event.game;

import project.ms.league.*;

public class Championship extends Game {
	
	private Team champion;
	
	public Championship(Team awayTeam, Team homeTeam) {
		super(awayTeam, homeTeam);
		this.champion = this.getWinner();
	}
	
	public Championship(Team awayTeam, Team homeTeam, String location) {
		super(awayTeam, homeTeam, location);
		this.champion = this.getWinner();
	}
	
	/*
	 * Getters and Setters for instance variables
	 */
	public Team getChampion() {
		return champion;
	}

	public void setChampion(Team champion) {
		this.champion = champion;
	}
}