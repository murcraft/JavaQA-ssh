package by.htp.project.entity.addtables;

import java.util.Random;

public class PointsMethod {
	
	public static void showStopPoints(StopPoint [] stopPoints) {
		for (int i = 0; i < stopPoints.length; i++) {
			System.out.print(" " + stopPoints[i] + "   ");
		}
		System.out.println();
	}
	
	public static StopPoint getStopPoint(StopPoint stopPoint, StopPoint [] stopPoints) {
		for(int i = 0; i < stopPoints.length; i++) {
			if(stopPoints[i].equals(stopPoint)) {
				return stopPoints[i];
			}
		}
		return null;
	}
	
	public static void inicializeMatrix(int[][] matrixA, int y, int x) {
		Random rand = new Random();
		for(int i = 0; i < y; i++) {
			for(int j = 0; j < x; j++) {
				if(j == i) {
					matrixA[i][j] = 0;
				} else {
					int num = rand.nextInt(21) + 10;
					matrixA[i][j] = num;
				}
			}
		}
	}
	
	public static void printMatrix(int[][] matrixA, int y, int x) {
		inicializeMatrix(matrixA, y,x);
		for(int i = 0; i < y; i++) {
			for(int j = 0; j < x; j++) {
				System.out.print("  " + matrixA[i][j] + "\t\t");
			}
			System.out.println();
		}
	}

}
