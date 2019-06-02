package edu.albany.Problem1;

import edu.albany.cargo.CargoShip;
import edu.albany.cruise.CruiseShip;

public class ShipDriver {

	public static void main(String[] args) {
		Ship[] ships = new Ship[9];
		
		// Test Ships
		Ship ship1 = new Ship("Titanic" , "1911");
		Ship ship2 = new Ship("The Queen Mary", "1934");
		Ship ship3 = new Ship("Lusitania", "1904");
		
		// Test CruiseShips
		CruiseShip ship4 = new CruiseShip("Carnival Vista", "2015", 3934);
		CruiseShip ship5 = new CruiseShip("Viking Sun", "2017", 930);
		CruiseShip ship6 = new CruiseShip("Silver Muse", "2017", 596);
		
		// Test CargoShips
		CargoShip ship7 = new CargoShip("SS Atlantic Causeway", "1969", 14946);
		CargoShip ship8 = new CargoShip("HMAS Westralia", "1973", 40870);
		CargoShip ship9 = new CargoShip("Altmark", "1936", 20858);
		
		ships[0] = ship1;
		ships[1] = ship2;
		ships[2] = ship3;
		ships[3] = ship4;
		ships[4] = ship5;
		ships[5] = ship6;
		ships[6] = ship7;
		ships[7] = ship8;
		ships[8] = ship9;
		
		for (int i = 0; i < ships.length; i++) {
			System.out.println(ships[i].toString()); 
		}	
	}
}