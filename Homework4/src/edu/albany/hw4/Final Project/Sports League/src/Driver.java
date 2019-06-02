import project.ms.league.*;
import project.ms.person.employee.leagueemployee.Comissioner;
import project.ms.util.generate.Generate;

/*
 * Demonstrates basic functionality of the Object-Oriented model of a sports league.
 * Creates a league and simulates through 1 season.
 * Prints the results.
 */
public class Driver {
	
	public static void main(String[] args) {
		//Create League
		League NFL = new League("NFL Simulation");
		Comissioner comissioner = Comissioner.getInstance("Roger Goodell");
		
		//AFC
		//AFC North
		NFL.getTeams().add(new Team("Pittsburgh", "Steelers"));
		NFL.getTeams().add(new Team("Cleveland", "Browns"));
		NFL.getTeams().add(new Team("Baltimore", "Ravens"));
		NFL.getTeams().add(new Team("Cincinnati", "Bengals"));
		
		//AFC East
		NFL.getTeams().add(new Team("Buffalo", "Bills"));
		NFL.getTeams().add(new Team("New York", "Jets"));
		NFL.getTeams().add(new Team("Miami", "Dolphins"));
		NFL.getTeams().add(new Team("New England", "Patriots"));
		
		//AFC South
		NFL.getTeams().add(new Team("Jacksonville", "Jaguars"));
		NFL.getTeams().add(new Team("Houston", "Texans"));
		NFL.getTeams().add(new Team("Indianapolis", "Colts"));
		NFL.getTeams().add(new Team("Tennesse", "Titans"));
		
		//AFC West
		NFL.getTeams().add(new Team("Los Angeles", "Chargers"));
		NFL.getTeams().add(new Team("Denver", "Broncos"));
		NFL.getTeams().add(new Team("Oakland", "Raiders"));
		NFL.getTeams().add(new Team("Kansas City", "Chiefs"));
		
		//NFC
		//NFC North
		NFL.getTeams().add(new Team("Green Bay", "Packers"));
		NFL.getTeams().add(new Team("Detroit", "Lions"));
		NFL.getTeams().add(new Team("Chicago", "Bears"));
		NFL.getTeams().add(new Team("Minnesota", "Vikings"));
		
		//NFC East
		NFL.getTeams().add(new Team("New York", "Giants"));		
		NFL.getTeams().add(new Team("Philidelphia", "Eagles"));
		NFL.getTeams().add(new Team("Dallas", "Cowboys"));
		NFL.getTeams().add(new Team("Washington", "Redskins"));
		
		//NFC South
		NFL.getTeams().add(new Team("Atlanta", "Falcons"));
		NFL.getTeams().add(new Team("Carolina", "Panthers"));
		NFL.getTeams().add(new Team("New Orleans", "Saints"));
		NFL.getTeams().add(new Team("Tampa Bay", "Buccaneers"));
		
		//NFC West
		NFL.getTeams().add(new Team("Arizona", "Cardinals"));
		NFL.getTeams().add(new Team("San Francisco", "49ers"));
		NFL.getTeams().add(new Team("Seatte", "Seahawks"));
		NFL.getTeams().add(new Team("Los Angeles", "Rams"));
		
		//Fill Conferences
		for(int i = 0; i < 16; i++) {
			NFL.getAmerican().getTeams().add(NFL.getTeams().get(i));
		}
		for (int i = 16; i < NFL.getTeams().size(); i++) {
			NFL.getNational().getTeams().add(NFL.getTeams().get(i));
		}
		
		//Fill Divisions
		for (int i = 0; i < 4; i++) {
			NFL.getAmerican().getNorth().getTeams().add(NFL.getTeams().get(i));
		}
		for (int i = 4; i < 8; i++) {
			NFL.getAmerican().getEast().getTeams().add(NFL.getTeams().get(i));
		}
		for (int i = 8; i < 12; i++) {
			NFL.getAmerican().getSouth().getTeams().add(NFL.getTeams().get(i));
		}
		for (int i = 12; i < 16; i++) {
			NFL.getAmerican().getWest().getTeams().add(NFL.getTeams().get(i));
		}
		for (int i = 16; i < 20; i++) {
			NFL.getNational().getNorth().getTeams().add(NFL.getTeams().get(i));
		}
		for (int i = 20; i < 24; i++) {
			NFL.getNational().getEast().getTeams().add(NFL.getTeams().get(i));
		}
		for (int i = 24; i < 28; i++) {
			NFL.getNational().getSouth().getTeams().add(NFL.getTeams().get(i));
		}
		for (int i = 28; i < 32; i++) {
			NFL.getNational().getWest().getTeams().add(NFL.getTeams().get(i));
		}
		
		// Print League by Conference and Division
		System.out.println(NFL.getName() + "\n");
		
		System.out.println("Comissioner: " + comissioner.name + "\n");
		
		System.out.println(NFL.getAmerican().getName());
		System.out.println(NFL.getAmerican().getNorth().getName());
		for (int i = 0; i < 4; i++) {
			System.out.println(NFL.getAmerican().getNorth().getTeams().get(i).toString());
		}
		System.out.println();
		System.out.println(NFL.getAmerican().getEast().getName());
		for (int i = 0; i < 4; i++) {
			System.out.println(NFL.getAmerican().getEast().getTeams().get(i).toString());
		}
		System.out.println();
		System.out.println(NFL.getAmerican().getSouth().getName());
		for (int i = 0; i < 4; i++) {
			System.out.println(NFL.getAmerican().getSouth().getTeams().get(i).toString());
		}
		System.out.println();
		System.out.println(NFL.getAmerican().getWest().getName());
		for (int i = 0; i < 4; i++) {
			System.out.println(NFL.getAmerican().getWest().getTeams().get(i).toString());
		}
		System.out.println();
		System.out.println(NFL.getNational().getName());
		System.out.println(NFL.getNational().getNorth().getName());
		for (int i = 0; i < 4; i++) {
			System.out.println(NFL.getNational().getNorth().getTeams().get(i).toString());
		}
		System.out.println();
		System.out.println(NFL.getNational().getEast().getName());
		for (int i = 0; i < 4; i++) {
			System.out.println(NFL.getNational().getEast().getTeams().get(i).toString());
		}
		System.out.println();
		System.out.println(NFL.getNational().getSouth().getName());
		for (int i = 0; i < 4; i++) {
			System.out.println(NFL.getNational().getSouth().getTeams().get(i).toString());
		}
		System.out.println();
		System.out.println(NFL.getNational().getWest().getName());
		for (int i = 0; i < 4; i++) {
			System.out.println(NFL.getNational().getWest().getTeams().get(i).toString());
		}
		
		//Generate random data for testing
		Generate gen = new Generate();
		
		//Create Schedule for the league
		NFL.setLeagueSchedule(gen.generateSchedule());
		
		//Simulate a full season
		gen.generateSeasonData(NFL);
		
		//Print Schedule with results
		System.out.println("Schedule: ");
		for (int i = 0; i < 16; i++) {
			
			int week = i + 1;
			System.out.println("\nWeek " + week);
			
			for (int j = 0; j < 16; j++) {
				
				System.out.println(NFL.getLeagueSchedule().getSchedule().get(i).get(j).getAwayTeam().getTeamName() 
						+ "  @  " 
						+ NFL.getLeagueSchedule().getSchedule().get(i).get(j).getHomeTeam().getTeamName()
						+ "   |   Results: " 
						+ NFL.getLeagueSchedule().getSchedule().get(i).get(j).getFinalScore() + " "
						+ NFL.getLeagueSchedule().getSchedule().get(i).get(j).getWinner());
				
			}		
		}
		
		// Create and print team rosters
		System.out.println();
		System.out.println("Team Rosters: ");
		for (int i = 0; i < NFL.getTeams().size(); i++) {
			
			System.out.println("\n" + NFL.getTeams().get(i).toString());
			NFL.getTeams().get(i).setRoster(gen.generateRoster());
			for (int j = 0; j < NFL.getTeams().get(i).getRoster().size(); j++) {
				
				System.out.println(NFL.getTeams().get(i).getRoster().get(j).toString());
			
			}	
		}
		
		// print out team records after the season is played
		System.out.println();
		System.out.println("Team Records: ");
		
		for (int i = 0; i < NFL.getTeams().size(); i++) {
			Team t = NFL.getTeams().get(i);
			System.out.println(t.getTeamName() + " : " + t.getRecord());
		}
		
		// Print out standings based off of records
		System.out.println();
		System.out.println("Standings: ");
		NFL.sortRankings();
		for (int i = 0; i < NFL.getTeamRankings().size(); i++) {
			System.out.println(NFL.getTeamRankings().get(i).getTeamName() + " : " + NFL.getTeamRankings().get(i).getRecord());
		}
	}
}