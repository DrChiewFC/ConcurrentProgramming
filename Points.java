/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentWIF3003;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public class Points {

	ArrayList<Float> xPoint = new ArrayList<>();
	ArrayList<Float> yPoint = new ArrayList<>();
	
//	float xPoint;	
	final Object lock = new Object();
//	float yPoint;
	
	public Points() {
		
	}
	
	public Points(int n) {
		
	}

	public void generateRandomPoints(int n) {
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
//			points[i].xPoint = rand.nextFloat() * (1000 - 0) + 0;
//			points[i].yPoint = rand.nextFloat() * (1000 - 0) + 0;
						
			xPoint.add(rand.nextFloat() * (1000 - 0) + 0);
			yPoint.add(rand.nextFloat() * (1000 - 0) + 0);

			for (int j = 0; j < i; j++) {
//				while(points[j].xPoint == points[j-1].xPoint) {
//					points[i].xPoint = rand.nextFloat() * (1000 - 0) + 0;
//				}
//				while(points[j].yPoint == points[j-1].yPoint) {
//					points[i].yPoint = rand.nextFloat() * (1000 - 0) + 0;
//				}
				while (xPoint.get(j).equals(xPoint.get(j + 1) > 0)) {
					xPoint.set(j, rand.nextFloat() * (1000 - 0) + 0);
				}
				while (yPoint.get(j).equals(yPoint.get(j + 1) > 0)) {
					yPoint.set(j, rand.nextFloat() * (1000 - 0) + 0);
				}
			}
			
			System.out.println("Point "+i+" = ("+xPoint.get(i)+","+yPoint.get(i)+")");
		}
		
	
//	public void generateRandomPoints(Points[] points,int n) {
//		Random rand = new Random();
//		for (int i = 0; i < n; i++) {
////			points[i].xPoint = rand.nextFloat() * (1000 - 0) + 0;
////			points[i].yPoint = rand.nextFloat() * (1000 - 0) + 0;
//						
//			xPoint.add(rand.nextFloat() * (1000 - 0) + 0);
//			yPoint.add(rand.nextFloat() * (1000 - 0) + 0);
////
//			for (int j = n; j > 0; j--) {
////				while(points[j].xPoint == points[j-1].xPoint) {
////					points[i].xPoint = rand.nextFloat() * (1000 - 0) + 0;
////				}
////				while(points[j].yPoint == points[j-1].yPoint) {
////					points[i].yPoint = rand.nextFloat() * (1000 - 0) + 0;
////				}
//				while (xPoint.get(j).equals(xPoint.get(j - 1) > 0)) {
//					xPoint.set(j, rand.nextFloat() * (1000 - 0) + 0);
//				}
//				while (yPoint.get(j).equals(yPoint.get(j - 1) > 0)) {
//					yPoint.set(j, rand.nextFloat() * (1000 - 0) + 0);
//				}
//			}
		}
		
		

	
	public float getxPoint(int index) {
		synchronized (lock) {
//			System.out.println("Xpoint : "+xPoint.get(index));
			return xPoint.get(index);}
	}

	public float getyPoint(int index) {
		synchronized (lock) {			
		return yPoint.get(index);}
	}

//	public void setxPoint(float xPoint) {
//		this.xPoint = xPoint;
//	}
//	
//	public void setyPoint(float yPoint) {
//		this.yPoint = yPoint;
//	}
//	
//	public synchronized void getPoints() {
		
				
	}
