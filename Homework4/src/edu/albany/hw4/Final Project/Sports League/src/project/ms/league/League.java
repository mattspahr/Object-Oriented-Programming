package project.ms.league;

import project.ms.league.event.game.Championship;
import project.ms.league.event.game.Game;
import project.ms.league.event.game.Schedule;

public class League extends Organization implements Winnable {

	private Schedule leagueSchedule;
	private Conference american;
	private Conference national;
	
	public League(String leagueName) {
		super(leagueName);
		american = new Conference("AFC");
		national = new Conference("NFC");
	}

	/*
	 * Getter and Setters for instance variables
	 */
	public Conference getAmerican() {
		return american;
	}

	public void setAmerican(Conference american) {
		this.american = american;
	}

	public Conference getNational() {
		return national;
	}

	public void setNational(Conference national) {
		this.national = national;
	}
	
	public Schedule getLeagueSchedule() {
		return leagueSchedule;
	}

	public void setLeagueSchedule(Schedule leagueSchedule) {
		this.leagueSchedule = leagueSchedule;
	}
	
	@Override
	public void declareWinner(Game g) {
		Championship championship = (Championship) g;
		
		g.declareWinner();
		this.setSeasonChampion(championship);
		
	}
}