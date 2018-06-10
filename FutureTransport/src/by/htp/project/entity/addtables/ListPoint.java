package by.htp.project.entity.addtables;

public class ListPoint {
	
	private StopPoint[] stopP;
	private final static int amtStan = 10;
	private int nElems;
	
	public ListPoint() {
		
	}
	
	public ListPoint(int amtStan) {
		stopP =  new StopPoint[amtStan];
		nElems = 0;
	}
	
	public void add(String startPoint, String endPoint, String distance) {
		stopP[nElems] = new StopPoint(startPoint, endPoint, distance);
		nElems++;
	}
	
	public StopPoint getListPoint(int nElems) {
		if(nElems >= 0 && nElems < amtStan) {
			return stopP[nElems];
		}
			return null;
	}
	
	public void displayStopPoint() {
		
	}

	public StopPoint[] getStopP() {
		return stopP;
	}

	public void setStopP(StopPoint[] stopP) {
		this.stopP = stopP;
	}
	
	public void getStopP(StopPoint[] stopP) {
		this.stopP = stopP;
	}

	public int getnElems() {
		return nElems;
	}

	public void setnElems(int nElems) {
		this.nElems = nElems;
	}

	public static int getAmtstan() {
		return amtStan;
	}
	
	public static void showStopPoints(ListPoint stopPoints) {
		for (int i = 0; i < stopPoints.getStopP().length; i++) {
			System.out.println(stopPoints.getListPoint(i));
		}
	}
	
	

}
