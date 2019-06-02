package project.ms.league;

import project.ms.league.event.game.Championship;
import project.ms.league.event.game.Game;

public class Division extends Organization implements Winnable{
	
	private Team team1;
	private Team team2;
	private Team team3;
	private Team team4;
	
	public Division(String name) {
		super(name);
	}

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public Team getTeam3() {
		return team3;
	}

	public void setTeam3(Team team3) {
		this.team3 = team3;
	}

	public Team getTeam4() {
		return team4;
	}

	public void setTeam4(Team team4) {
		this.team4 = team4;
	}
	
	@Override
	public void declareWinner(Game g) {
		Championship championship = (Championship) g;
		
		g.declareWinner();
		this.setSeasonChampion(championship);
		
	}
}