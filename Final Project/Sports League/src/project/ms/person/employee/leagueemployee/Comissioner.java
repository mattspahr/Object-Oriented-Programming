package project.ms.person.employee.leagueemployee;

/*
 * Implements Singleton Design Pattern to limit to only one Comissioner
 */
public class Comissioner {
	private static Comissioner single = null;
	
	public String name;
	
	private Comissioner(String name) {
		this.name = name;
	}
	
	public static Comissioner getInstance(String name) {
		if (single == null)
			single = new Comissioner(name);
		return single;
	}
	
}