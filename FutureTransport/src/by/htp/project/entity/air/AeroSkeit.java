package by.htp.project.entity.air;

import by.htp.project.entity.addtables.StopPoint;

public class AeroSkeit extends AirTrans {

	public AeroSkeit() {
		super();
	}

	public AeroSkeit(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate,
			int capacityOfPeople, StopPoint initialStop, StopPoint endingStop, double maxHgtAltitude) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop, endingStop,
				maxHgtAltitude);
	}
	

}
