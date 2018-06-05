package by.htp.project1.run;

import by.htp.project1.entity.Accessories;
import by.htp.project1.entity.BouquetPart;
import by.htp.project1.entity.Clumbs;
import by.htp.project1.entity.Natural;
import by.htp.project1.entity.Rooms;

public class MainApp {

	public static void main(String[] args) {
				
		BouquetPart [] flowers =  new BouquetPart[] {
				new Natural(),
				new Clumbs(),
				new Rooms(),
				new Clumbs(),
				new Accessories()
		};
				
		for (BouquetPart flower : flowers) {
			System.out.println(flower.toString());
		}
	

	}
	

}
