package by.htp.project.run;

import by.htp.project.entity.PassengerTrans;
import by.htp.project.entity.addtables.StopPoint;
import by.htp.project.entity.air.AeroSkeit;
import by.htp.project.entity.air.FlyCar;
import by.htp.project.entity.air.SkyTran;
import by.htp.project.entity.land.Bike;
import by.htp.project.entity.land.Next;
import by.htp.project.entity.land.Rail;
import by.htp.project.entity.land.Scarab;
import by.htp.project.entity.land.Teb;
import by.htp.project.entity.undeground.Hyperloop;
import by.htp.project.entity.undeground.SpeedSubway;
import by.htp.project.logic.User;

public class MainApp {

	public static void main(String[] args) {
		int amtTransp = 10;
		int choise;
		
		StopPoint [] stopPoints = new StopPoint[StopPoint.getAmtStan()];
		
		stopPoints[0] = new StopPoint("Malinouka");
		stopPoints[1] = new StopPoint("Urychie");
		stopPoints[2] = new StopPoint("KamennaaGorka");
		stopPoints[3] = new StopPoint("Chigouka");
		stopPoints[4] = new StopPoint("Autozavodskaa");
		
		PassengerTrans[] transport = new PassengerTrans[amtTransp];

		transport[0] = new Hyperloop("Hyperloop", 123900, 15, 110, 490, "12.03.2017", 450, stopPoints[0], stopPoints[1], 8.6, true);
		transport[1] = new SpeedSubway("SpeedSubway", 12300, 3, 24.5, 128, "12.03.2005", 320, stopPoints[1], stopPoints[2], 10.2, 15.6);
		transport[2] = new Next("Next", 2330, 7, 17.5, 5, "22.09.2011", 230, stopPoints[3], stopPoints[2], true, true, 4);
		transport[3] = new Rail("Rail", 9830, 4, 16.5, 128, "12.03.2001", 450, stopPoints[3], stopPoints[4], false, 150, 14.2);
		transport[4] = new Scarab("Rail", 9830, 4, 25.5, 128, "12.03.2001", 2, stopPoints[4], stopPoints[0], true, true);
		transport[5] = new Teb("Teb", 9830, 4, 25.5, 128, "12.03.2001", 38, stopPoints[4], stopPoints[2], true, true);
		transport[6] = new Bike("Bike", 9830, 0, 25.5, 128, "12.03.2001", 1, stopPoints[3], stopPoints[0], true, false);
		transport[7] = new SkyTran("SkyTran", 1830, 5, 5.5, 30, "12.03.2016", 31, stopPoints[3], stopPoints[1], 10, true, true);
		transport[8] = new FlyCar("SkyTran", 1830, 3, 5.5, 30, "12.03.2016", 31, stopPoints[2], stopPoints[0], 10, true);
		transport[9] = new AeroSkeit("SkyTran", 1830, 4, 5.5, 30, "12.03.2016", 31, stopPoints[1], stopPoints[2], 10);

		User.showMenu();
		choise = User.getUserCommand();
		User.isTrueUserCommand(choise);
		User.showTranspToUser(choise, transport, stopPoints);

	}	
	

/*	доделать методы для поиска рассояния в матрице расстояний PointDistance
 * (сейчас есть только введенная пользователем станция)
 * и посчитать время, а после скорость при имеющемся ускорении транспорта 
  
 	choise = User.getUserCommand();
	position = ArrayMethod.getStartPoint(stopPoints, stopPoints[choise]);
	System.out.println(position);
	choise = User.getUserCommand();
	position1 = ArrayMethod.getStartPoint(stopPoints, stopPoints[choise]); 
	*/
}
