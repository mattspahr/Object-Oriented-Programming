package project.ms.league;

import project.ms.league.event.game.Championship;
import project.ms.league.event.game.Game;

public class Conference extends Organization implements Winnable {
	
	private Division north;
	private Division east;
	private Division south;
	private Division west;
	
	public Conference(String conferenceName) {
		super(conferenceName);
		north = new Division(this.getName() + " North");
		east = new Division(this.getName() + " East");
		south = new Division(this.getName() + " South");
		west = new Division(this.getName() + " West");		
	}
	
	public Division getNorth() {
		return this.north;
	}
	
	public void setNorth(Division north) {
		this.north = north;
	}
	
	public Division getEast() {
		return this.east;
	}
	
	public void setEast(Division east) {
		this.east = east;
	}
	
	public Division getSouth() {
		return this.south;
	}
	
	public void setSouth(Division south) {
		this.south = south;
	}
	
	public Division getWest() {
		return this.west;
	}
	
	public void setWest(Division west) {
		this.west = west;
	}
	
	@Override
	public void declareWinner(Game g) {
		Championship championship = (Championship) g;
		
		g.declareWinner();
		this.setSeasonChampion(championship);
		
	}
}