package by.htp.project.entity.addtables;

public class StopPoint {
	private String name;
	private static int amtStan = 5;
	
	public StopPoint() {
		
	}
	
	public StopPoint(String name) {
		this.setName(name);
	}

	private StopPoint [] stopPoints = new StopPoint[amtStan];
	
	public StopPoint[] getStations() {
		return stopPoints;
	}

	public static int getAmtStan() {
		return amtStan;
	}

	public void setAmtStantions(int amtStan) {
		StopPoint.amtStan = amtStan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return  "\"" + name + "\"";
	}


}

