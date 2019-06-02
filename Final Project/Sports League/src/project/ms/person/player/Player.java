package project.ms.person.player;

import project.ms.person.Person;

import project.ms.position.Position;

/*
 *	PLayer class represents a football player 
 */
public class Player extends Person {
	private Position position;
	private String jerseyNumber;
	
	public Player(String firstName, String lastName, Position position, String jerseyNumber) {
		super(firstName, lastName);
		this.position = position;
		this.jerseyNumber = jerseyNumber;
	}
	
	/*
	 * Getters and Setters
	 */
	public Position getPosition() {
		return this.position;
	}
	
	public String getJerseyNumber() {
		return this.jerseyNumber;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public String toString() {
		return this.position + " #" + this.getJerseyNumber() + " " +this.getName();
	}
}