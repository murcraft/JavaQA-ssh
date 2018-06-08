package by.htp.project.entity.addtables;

public class PointDistance {
	
	private static int line = StopPoint.getAmtStan();
	private static int column  = StopPoint.getAmtStan();
	
	public PointDistance(){
		
	}
	
	public PointDistance(int line, int column){
		PointDistance.line = line;
		PointDistance.column = column;
	}
	
	public static int [][] distances = new int[column][line];
	
	public static int getLine() {
		return line;
	}

	public static int getColumn() {
		return column;
	}

	public int [][] getDistances() {
		return distances;
	}

	public void setDistances(int [][] distances) {
		PointDistance.distances = distances;
	}
	
	

}
