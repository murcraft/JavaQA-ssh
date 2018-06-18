package by.htp.project.run;

import by.htp.project.entity.AirTrans;
import by.htp.project.entity.LandTrans;
import by.htp.project.entity.PassengerTrans;
import by.htp.project.entity.UndegroundTrans;
import by.htp.project.entity.points.ListPoint;
import by.htp.project.logic.User;

public class MainApp {

	public static void main(String[] args) {

		int amtTransp = 10;
		int choise;
		
		ListPoint stopPoints = new ListPoint(amtTransp);
		
		stopPoints.add("Malinouka", "Urychie", "18");
		stopPoints.add("Malinouka", "KamGorka", "12");
		stopPoints.add("Malinouka", "Stepianka", "25");
		stopPoints.add("Malinouka", "Autozavodskaa", "20");
		stopPoints.add("Urychie", "Novinki", "13");
		stopPoints.add("Urychie", "Chijovka", "11");
		stopPoints.add("Nemiga", "Urychie", "9");
		stopPoints.add("Grushevka", "Molodejnaa", "12");
		stopPoints.add("Kolasa", "Stepianka", "12");
		stopPoints.add("Chkalova", "Kopische", "16");
		
		PassengerTrans[] transport = new PassengerTrans[amtTransp];

		transport[0] = new UndegroundTrans("Hyperloop", 123900, 15, 110, 490, "12.03.2017", 450, stopPoints.getListPoint(0), 7.5);
		transport[1] = new UndegroundTrans("SpeedSubway", 12300, 3, 24.5, 128, "12.03.2005", 320, stopPoints.getListPoint(1), 10.2);
		transport[2] = new LandTrans("Next", 2330, 7, 17.5, 5, "22.09.2011", 230, stopPoints.getListPoint(3), true);
		transport[3] = new LandTrans("Rail", 9830, 4, 16.5, 128, "12.03.2001", 450, stopPoints.getListPoint(4), false);
		transport[4] = new LandTrans("Scarab", 9830, 4, 25.5, 128, "12.03.2001", 2,  stopPoints.getListPoint(9), true);
		transport[5] = new LandTrans("Teb", 9830, 4, 25.5, 128, "12.03.2001", 38,  stopPoints.getListPoint(5), false);
		transport[6] = new LandTrans("Bike", 9830, 0, 25.5, 128, "12.03.2001", 1,  stopPoints.getListPoint(7), true);
		transport[7] = new AirTrans("SkyTran", 1830, 5, 5.5, 30, "12.03.2016", 31,  stopPoints.getListPoint(8), 1120);
		transport[8] = new AirTrans("FlyCar", 1830, 3, 5.5, 30, "12.03.2016", 31,  stopPoints.getListPoint(4), 760);
		transport[9] = new AirTrans("AeroSkeit", 1830, 4, 5.5, 30, "12.03.2016", 31,  stopPoints.getListPoint(9), 20);

		
		double[] avrSpeed = new double[10];
		
		User.showMenu();
		choise = User.getUserCommand();
		User.isTrueUserCommand(choise);
		User.showTranspToUser(choise, transport, stopPoints, avrSpeed);

	}	
	
}
