package project.ms.position;

import java.util.Random;

/*
 * Enum represents all of the positions in football
 */
public enum Position {
	LT("Left Tackle"),
	LG("Left Guard"),
	C("Center"),
	RG("Right Guard"),
	RT("Right Tackle"),
	QB("Quarterback"),
	HB("Running Back"),
	WR("Wide Reciever"),
	FB("Full Back"),
	TE("Tight End"),
	LE("Left End"),
	DT("Defensive Tackle"),
	RE("Right End"),
	LOLB("Left Outside Linebacker"),
	ROLB("Right Outside Linebacker"),
	MLB("Middle Linebacker"),
	CB("Cornerback"),
	FS("Free Safety"),
	SS("Strong Safety"),
	K("Kicker"),
	P("Punter"),
	KR("Kick Return"),
	PR("Punt Return"),
	LS("Long Snapper");
	
	private String pos;
	
	Position(String pos) {
		this.pos = pos;
	}
	
	public String getPosition() {
		return pos;
	}
	
	/*
	 * Pick a random Position from the Position enum
	 * @return a random Position
	 */
	public static Position getRandomPosition() {
		Random rand = new Random();
		return values()[rand.nextInt(values().length)];
	}
}