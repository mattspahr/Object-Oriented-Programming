package project.ms.league.event;

public abstract class Event {

	protected static int eventCount = 0;
	private int eventId;
	
	public Event() {
		this.eventId = eventCount++;
	}
	
	public int getEventId() {
		return this.eventId;
	}
	
	public void setEventId(int eId) {
		this.eventId = eId;
	}
	
	public abstract String toString();
}
