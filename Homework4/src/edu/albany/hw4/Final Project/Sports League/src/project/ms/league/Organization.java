package project.ms.league;

import java.util.ArrayList;
import java.util.Collections;

import project.ms.league.event.game.Championship;

public abstract class Organization {
	
	private String name;
	private ArrayList<Championship> champions;
	private ArrayList<Team> teamRankings;
	private ArrayList<Team> teams;
	private Championship seasonChampion;
	
	public Organization(String name) {
		this.setName(name);
		teams = new ArrayList<Team>();
		champions = new ArrayList<Championship>();
		teamRankings = teams;
	}
	
	/*
	 * Getters and Setters
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Championship> getChampions() {
		return champions;
	}

	public void setChampions(ArrayList<Championship> champions) {
		this.champions = champions;
	}

	public ArrayList<Team> getTeamRankings() {
		return teamRankings;
	}

	public void setTeamRankings(ArrayList<Team> teamRankings) {
		this.teamRankings = teamRankings;
	}
	
	public Championship getSeasonChampion() {
		return seasonChampion;
	}

	public void setSeasonChampion(Championship seasonChampion) {
		this.seasonChampion = seasonChampion;
	}

	public ArrayList<Team> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}

	/*
	 * Sorts the list of teams by how many wins they have
	 */
	public void sortRankings() {
		for (int i = 0; i < teamRankings.size() - 1; i++) {
			for (int j = 0; j < teamRankings.size() - i - 1; j++) {
				
				if (teamRankings.get(j).getWins() < teamRankings.get(j+1).getWins()) {
				
					Collections.swap(teamRankings, j  , j + 1);
				
				}
			}
		}
	}
}