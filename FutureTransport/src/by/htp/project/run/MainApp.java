package by.htp.project.run;

import by.htp.project.entity.PassengerTrans;
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
import by.htp.project.logic.ArrayMethod;

public class MainApp {

	public static void main(String[] args) {
		
		int size = 10;
		
		PassengerTrans[] transport = new PassengerTrans[size];

		transport[0] = new Hyperloop("Hyperloop", 123900, 15, 110, 490, "12.03.2017", 450, "Malinovka", "Stepianka", 8.6, true);
		transport[1] = new SpeedSubway("SpeedSubway", 12300, 3, 24.5, 128, "12.03.2005", 320, "Malinovka", "Stepianka", 10.2, 15.6);
		transport[2] = new Next("Next", 2330, 7, 17.5, 5, "22.09.2011", 230, "Malinovka", "Stepianka", true, true, 4);
		transport[3] = new Rail("Rail", 9830, 4, 16.5, 128, "12.03.2001", 450, "Malinovka", "Stepianka", false, 150, 14.2);
		transport[4] = new Scarab("Rail", 9830, 4, 25.5, 128, "12.03.2001", 2, "Malinovka", "Stepianka", true, true);
		transport[5] = new Teb("Teb", 9830, 4, 25.5, 128, "12.03.2001", 38, "Malinovka", "Stepianka", true, true);
		transport[6] = new Bike("Bike", 9830, 0, 25.5, 128, "12.03.2001", 1, "Malinovka", "Stepianka", true, false);
		transport[7] = new SkyTran("SkyTran", 1830, 5, 5.5, 30, "12.03.2016", 31, "Malinovka", "Stepianka", 10, true, true);
		transport[8] = new FlyCar("SkyTran", 1830, 3, 5.5, 30, "12.03.2016", 31, "Malinovka", "Stepianka", 10, true);
		transport[9] = new AeroSkeit("SkyTran", 1830, 4, 5.5, 30, "12.03.2016", 31, "Malinovka", "Stepianka", 10);
		
		ArrayMethod.printListTransport(transport);
		ArrayMethod.sortFare(transport);
		System.out.println("Sort in fare:");
		ArrayMethod.printListTransport(transport);
		System.out.println("Sort in speed:");
		ArrayMethod.sortSpeed(transport);
		ArrayMethod.printListTransport(transport);

	}	
}
