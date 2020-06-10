/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentconcurrentii;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author User
 */
public class Points {

	static ArrayList<Float> xPoint;
	static ArrayList<Float> yPoint;
	static ArrayList<String> isTaken;
	

	final ReentrantLock lock = new ReentrantLock();

	public Points() {

	}

	public Points(int n) {
		xPoint = new ArrayList<Float>(n);
		yPoint = new ArrayList<Float>(n);
		isTaken = new ArrayList<String>(n);
		for(int i=0;i<n;i++) {
			isTaken.add("false");
		}
//		for(int i=0;i<isTaken.size();i++) {
//			System.out.println(isTaken.get(i));
//		}
	}

	//to generate random unique points, no points are same
	public void generateRandomPoints(int n) {
		Random rand = new Random();
		System.out.println("\nList of Points : ");
		for (int i = 0; i < n; i++) {
			xPoint.add(rand.nextFloat() * (1000 - 0) + 0);
			yPoint.add(rand.nextFloat() * (1000 - 0) + 0);

			for (int j = 0; j < i; j++) {
				while (xPoint.get(j).equals(xPoint.get(j + 1) > 0)) {
					xPoint.set(j, rand.nextFloat() * (1000 - 0) + 0);
				}
				while (yPoint.get(j).equals(yPoint.get(j + 1) > 0)) {
					yPoint.set(j, rand.nextFloat() * (1000 - 0) + 0);
				}
			}
			System.out.println("Point " + (i + 1) + " = (" + xPoint.get(i) + "," + yPoint.get(i) + ")");
		}
	}

	//to assign points to thread
	//if isTaken flag is false, assign points to the thread
	//if isTaken flag is true, return 0 to thread to get other points
	public synchronized float getxPoint(int index) {
		if(isTaken.get(index).equals("false")) {
			isTaken.set(index, "true");
			return xPoint.get(index);
		}
		else {
			return 0;
		}
		
	}

	public float getyPoint(int index) {
		return yPoint.get(index);
	}
	
	public static String getIsTaken() {
		return isTaken.toString();
	}
}
