package by.htp.project.entity.points;

public class StopPoint {
	private String startPoint;
	private String endPoint;
	private String distance;
	
	public StopPoint() {
		
	}
	
	public StopPoint(String startPoint, String endPoint, String distance) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.distance = distance;
	}

	public String getName() {
		return startPoint;
	}

	public void setName(String name) {
		this.startPoint = name;
	}
	
	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	
	@Override
	public String toString() {
		return startPoint + " to " + endPoint + " = " + distance + " km";
	}
	
}

