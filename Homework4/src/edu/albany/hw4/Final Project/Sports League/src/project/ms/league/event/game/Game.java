package project.ms.league.event.game;

import project.ms.league.Team;
import project.ms.league.Winnable;
import project.ms.league.event.Event;

public class Game extends Event implements Winnable {

	private Team homeTeam;
	private Team awayTeam;
	private Team winner;
	private Team loser;
	private String location;
	private int homeTeamFinalScore;
	private int awayTeamFinalScore;
	private String finalScore;
	
	public Game() { }
	
	public Game(Team awayTeam, Team homeTeam) {
		this.awayTeam = awayTeam;
		this.homeTeam = homeTeam;
		this.setLocation(homeTeam.getCity());
	}
	
	public Game(Team awayTeam, Team homeTeam, String location) {
		this.awayTeam = awayTeam;
		this.homeTeam = homeTeam;
		this.setLocation(location);
	}
	
	public Game(Team awayTeam, Team homeTeam, int homeScore, int awayScore) {
		this.awayTeam = awayTeam;
		this.homeTeam = homeTeam;
		this.setLocation(homeTeam.getCity());
		this.setHomeTeamFinalScore(homeScore);
		this.setAwayTeamFinalScore(awayScore);
		if (homeScore > awayScore) {
			this.setFinalScore(String.valueOf(homeScore) + "-" + String.valueOf(awayScore));
			this.setWinner(this.homeTeam);
			this.setLoser(this.awayTeam);
		} else {
			this.setFinalScore(String.valueOf(awayScore) + "-" + String.valueOf(homeScore));
			this.setWinner(this.awayTeam);
			this.setLoser(this.homeTeam);
		}
	}
	
	/*
	 * Getters and Setters for instance variables.
	 */
	public Team getHomeTeam() {
		return this.homeTeam;
	}
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	
	public Team getAwayTeam() {
		return this.awayTeam;
	}
	
	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}
	
	public Team getWinner() {
		return winner;
	}

	public void setWinner(Team winner) {
		this.winner = winner;
	}

	public Team getLoser() {
		return loser;
	}

	public void setLoser(Team loser) {
		this.loser = loser;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getHomeTeamFinalScore() {
		return homeTeamFinalScore;
	}

	public void setHomeTeamFinalScore(int homeTeamFinalScore) {
		this.homeTeamFinalScore = homeTeamFinalScore;
	}

	public int getAwayTeamFinalScore() {
		return awayTeamFinalScore;
	}

	public void setAwayTeamFinalScore(int awayTeamFinalScore) {
		this.awayTeamFinalScore = awayTeamFinalScore;
	}

	public String getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(String finalScore) {
		this.finalScore = finalScore;
	}

	@Override
	public String toString() {
		return awayTeam.getCity() + " " + awayTeam.getTeamName() + 
				" @ " + homeTeam.getCity() + " " + homeTeam.getTeamName();
	}
	
	/*
	 * declareWinner() - determines the winner and loser of a Game
	 */
	public void declareWinner() {
		if (this.homeTeamFinalScore > this.awayTeamFinalScore) {
			// If the home team wins the game
			this.setFinalScore(String.valueOf(this.homeTeamFinalScore) + "-" 
					+ String.valueOf(this.awayTeamFinalScore));
			this.setWinner(this.homeTeam);
			this.setLoser(this.awayTeam);
			homeTeam.incrementWins();
			awayTeam.incrementLosses();
			
		} else if (this.homeTeamFinalScore < this.awayTeamFinalScore) {
			// If the away team wins the game
			this.setFinalScore(String.valueOf(this.awayTeamFinalScore) + "-" 
					+ String.valueOf(this.homeTeamFinalScore));
			this.setWinner(this.awayTeam);
			this.setLoser(this.homeTeam);
			awayTeam.incrementWins();
			homeTeam.incrementLosses();
			
		} else {
			//  If the score is tied
			this.setFinalScore(String.valueOf(this.awayTeamFinalScore) + "-" 
					+ String.valueOf(this.homeTeamFinalScore));
			this.setWinner(null);
			this.setLoser(null);
			
		}
	}
	
	/*
	 * From Winnable
	 * declareWinner(Game g) - determines the winner and loser of a Game
	 */
	public void declareWinner(Game g) {
		g.declareWinner();
	}
	
}