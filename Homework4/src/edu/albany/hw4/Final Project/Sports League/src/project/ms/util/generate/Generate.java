package project.ms.util.generate;

import project.ms.league.League;

import project.ms.league.Team;
import project.ms.league.event.game.Game;
import project.ms.league.event.game.Schedule;
import project.ms.person.player.Player;
import project.ms.position.Position;

import java.util.ArrayList;
import java.util.Random;

/*
 * This class generates specific data based on the current 32 NFL teams to use for testing.
 */
public class Generate {
	
	protected static ArrayList<Team> nflTeams = new ArrayList<Team>();
	protected static ArrayList<String> firstNames = new ArrayList<String>();
	protected static ArrayList<String> lastNames = new ArrayList<String>();
	
	public Generate() { 
		fillNFLTeams();
		fillFirstNames();
		fillLastNames();
	}
	
	/*
	 * Generates a unique 16-week schedule for each team
	 */
	public Schedule generateSchedule() {
		Schedule schedule = new Schedule();
		Random rand = new Random();
		
		ArrayList<Team> copyCat = new ArrayList<Team>();
		
		// Outside Loop - Weeks
		for (int i = 0; i < schedule.getSchedule().size(); i++) {
			//Fill copyCat ArrayList for each week
			for (int x = 0; x < nflTeams.size(); x++) {
				copyCat.add(nflTeams.get(x));
			}			
			
			// Inner Loop traverses through each game in a week
			// Terminates when all teams have been given a match-up for the week
			int j = 0;
			int team1 = rand.nextInt(copyCat.size() - 1);
			int team2 = rand.nextInt(copyCat.size() - 1);
			
			while (!(copyCat.size() == 0)) {
				
				if ((team1 != team2) && (copyCat.contains(copyCat.get(team1))) && (copyCat.contains(copyCat.get(team2)))) {
					
					// Add teams to game
					schedule.getSchedule().get(i).get(j).setAwayTeam(copyCat.get(team1));
					schedule.getSchedule().get(i).get(j).setHomeTeam(copyCat.get(team2));
					
					// Remove games from available list of teams to choose from 
					copyCat.remove(schedule.getSchedule().get(i).get(j).getAwayTeam());
					copyCat.remove(schedule.getSchedule().get(i).get(j).getHomeTeam());
					
					// Select new teams if copyCat is not empty 
					if (copyCat.size() != 0) {
						team1 = rand.nextInt(copyCat.size());
						team2 = rand.nextInt(copyCat.size());
					} else {
						break;
					}
					
					// Increment to next game
					j++;
					
				}
				
				// Team indexes did not fit criteria
				// Choose new ones
				if (copyCat.size() != 0) {
					team1 = rand.nextInt(copyCat.size());
					team2 = rand.nextInt(copyCat.size());
				}
				
			}
			
		}
		
		return schedule;
	}
	
	/*
	 * Generates the final score of a game
	 */
	public void generateGameData(Game g) {
		Random rand = new Random();
		Integer awayScore = rand.nextInt(27);
		Integer homeScore = rand.nextInt(30);
		
		if (awayScore != homeScore) {
			g.setAwayTeamFinalScore(awayScore);
			g.setHomeTeamFinalScore(homeScore);
			g.declareWinner();
			
			if (awayScore > homeScore) {
				g.setFinalScore(awayScore.toString() + " - " + homeScore.toString());
			} else {
				g.setFinalScore(homeScore.toString() + " - " + awayScore.toString());
			}
		} else {
			awayScore = rand.nextInt(45);
			homeScore = rand.nextInt(50);
			g.setAwayTeamFinalScore(awayScore);
			g.setHomeTeamFinalScore(homeScore);
			g.declareWinner();
			
			if (awayScore > homeScore) {
				g.setFinalScore(awayScore.toString() + " - " + homeScore.toString());
			} else {
				g.setFinalScore(homeScore.toString() + " - " + awayScore.toString());
			}
		}
	}
	
	/*
	 * Simulate through a season
	 */
	public void generateSeasonData(League nfl) {
		Schedule sched = nfl.getLeagueSchedule();
		ArrayList<Team> teams = nfl.getTeams();
		
		for (int i = 0; i < 16; i++) {
			
			for (int j = 0; j < 16; j++) {
				Game g = sched.getSchedule().get(i).get(j);
				boolean winFlag = true; boolean loseFlag = true;
				
				generateGameData(g);
				
				for (int index = 0; index < teams.size(); index++) {
					Team winner = g.getWinner();
					Team loser = g.getLoser();			
					
					try {
						if (winner.getTeamName().equals(teams.get(index).getTeamName()) && winFlag == true){
							teams.get(index).incrementWins();
							winFlag = false;
						}
						
						if ((loser.getTeamName().equals(teams.get(index).getTeamName()) && loseFlag == true)) {
							teams.get(index).incrementLosses();
							loseFlag = false;
						}
					} catch (NullPointerException e) {
						System.out.println("team name empty!");
					}	
				}	
			}	
		}	
	}
	
	/*
	 * Generate a Player
	 */
	public Player generatePlayer() {
		Random rand = new Random();
		String firstName, lastName, jerseyNumber;
		Position pos;
		
		Integer index = rand.nextInt(firstNames.size() - 1);
		firstName = firstNames.get(index);
		
		index = rand.nextInt(lastNames.size() - 1);
		lastName = lastNames.get(index);
		
		index = rand.nextInt(98) + 1;
		jerseyNumber = index.toString();
		
		pos = Position.getRandomPosition();
		
		return new Player(firstName, lastName, pos, jerseyNumber);
	}
	
	/*
	 * Generates a list of Players
	 */
	public ArrayList<Player> generateRoster() {
		ArrayList<Player> roster = new ArrayList<>();
		Player p = generatePlayer();
		
		for (int i = 0; i < 10; i++) {
			roster.add(p);
			p = generatePlayer();
		}	
		
		return roster;
	}
	
	/*
	 * Populates the nflTeams ArrayList with each team in the NFL
	 */
	public static void fillNFLTeams() {
		nflTeams.add(new Team("Pittsburgh", "Steelers"));
		nflTeams.add(new Team("Clevland", "Browns"));
		nflTeams.add(new Team("Baltimore", "Ravens"));
		nflTeams.add(new Team("Cincinnati", "Bengals"));
		
		//AFC East
		nflTeams.add(new Team("Buffalo", "Bills"));
		nflTeams.add(new Team("New York", "Jets"));
		nflTeams.add(new Team("Miami", "Dolphins"));
		nflTeams.add(new Team("New England", "Patriots"));
		
		//AFC South
		nflTeams.add(new Team("Jacksonville", "Jaguars"));
		nflTeams.add(new Team("Houston", "Texans"));
		nflTeams.add(new Team("Indianapolis", "Colts"));
		nflTeams.add(new Team("Tennesse", "Titans"));
		
		//AFC West
		nflTeams.add(new Team("Los Angeles", "Chargers"));
		nflTeams.add(new Team("Denver", "Broncos"));
		nflTeams.add(new Team("Oakland", "Raiders"));
		nflTeams.add(new Team("Kansas City", "Chiefs"));
		
		//NFC
		//NFC North
		nflTeams.add(new Team("Green Bay", "Packers"));
		nflTeams.add(new Team("Detroit", "Lions"));
		nflTeams.add(new Team("Chicago", "Bears"));
		nflTeams.add(new Team("Minnesota", "Vikings"));
		
		//NFC East
		nflTeams.add(new Team("New York", "Giants"));		
		nflTeams.add(new Team("Philidelphia", "Eagles"));
		nflTeams.add(new Team("Dallas", "Cowboys"));
		nflTeams.add(new Team("Washington", "Redskins"));
		
		//NFC South
		nflTeams.add(new Team("Atlanta", "Falcons"));
		nflTeams.add(new Team("Carolina", "Panthers"));
		nflTeams.add(new Team("New Orleans", "Saints"));
		nflTeams.add(new Team("Tampa Bay", "Buccaneers"));
		
		//NFC West
		nflTeams.add(new Team("Arizona", "Cardinals"));
		nflTeams.add(new Team("San Francisco", "49ers"));
		nflTeams.add(new Team("Seatte", "Seahawks"));
		nflTeams.add(new Team("Los Angeles", "Rams"));
	}
	
	/*
	 * Populates the firstNames ArrayList with a set of first names
	 */
	public static void fillFirstNames() {
		firstNames.add("Matt");
		firstNames.add("Michael");
		firstNames.add("Dustin");
		firstNames.add("DeShawn");
		firstNames.add("Tyler");
		firstNames.add("Brandon");
		firstNames.add("Darnell");
		firstNames.add("Malik");
		firstNames.add("Terrel");
		firstNames.add("Jacob");
		firstNames.add("Andrew");
		firstNames.add("Billy");
		firstNames.add("James"); 
		firstNames.add("Tom");
		firstNames.add("Aaron");
		firstNames.add("Chris");
		firstNames.add("Chad");
		firstNames.add("DeAndre");
		firstNames.add("Jamal");
		firstNames.add("Tyrone");
		firstNames.add("Marquis");
		firstNames.add("Colin");
		firstNames.add("Maxwell");
		firstNames.add("Bradley");
		firstNames.add("Lucas");
		firstNames.add("Luke");
		firstNames.add("Jake");
		firstNames.add("Willie");
		firstNames.add("Xavier");
		firstNames.add("Andre");
	}
	
	/*
	 * Populates the lastNames ArrayList with a set of last names
	 */
	public static void fillLastNames() {
		//Names added twice because of frequency in NFL
		lastNames.add("Johnson"); lastNames.add("Williams");
		lastNames.add("Smith"); lastNames.add("Brown");
		lastNames.add("Jones"); lastNames.add("Davis");
		lastNames.add("Harris"); lastNames.add("Jackson");
		lastNames.add("Thomas"); lastNames.add("Allen");
		lastNames.add("Johnson"); lastNames.add("Williams");
		lastNames.add("Smith"); lastNames.add("Brown");
		lastNames.add("Jones"); lastNames.add("Davis");
		lastNames.add("Harris"); lastNames.add("Jackson");
		lastNames.add("Thomas"); lastNames.add("Allen");
		lastNames.add("Taylor"); lastNames.add("Wilson");
		lastNames.add("Young"); lastNames.add("Miller");
		lastNames.add("Walker"); lastNames.add("Lewis");
		lastNames.add("Spahr"); lastNames.add("Anderson");
		lastNames.add("Robison"); lastNames.add("Washington");
		lastNames.add("Robinson"); lastNames.add("Adams");
		lastNames.add("Conway"); lastNames.add("Quick");
		lastNames.add("Diamond"); lastNames.add("Brady");
		lastNames.add("Barrow"); lastNames.add("Crabbe");
		lastNames.add("Scott"); lastNames.add("Hogan");
		lastNames.add("Hall"); lastNames.add("Gold");
		lastNames.add("Butler"); lastNames.add("McAdams");
		lastNames.add("Moore"); lastNames.add("Drew");
		lastNames.add("Burfict"); lastNames.add("Dirt");
		lastNames.add("Rodgers"); lastNames.add("Wesson");
	}
}