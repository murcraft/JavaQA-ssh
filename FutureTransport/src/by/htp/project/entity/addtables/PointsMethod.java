package by.htp.project.entity.addtables;

public class PointsMethod {
		
	public static StopPoint getStopPoint(StopPoint stopPoint, StopPoint [] stopPoints) {
		for(int i = 0; i < stopPoints.length; i++) {
			if(stopPoints[i].equals(stopPoint)) {
				return stopPoints[i];
			}
		}
		return null;
	}

}
