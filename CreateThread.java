package assignmentWIF3003;

import java.util.ArrayList;
import java.util.Random;

public class CreateThread implements Runnable {

	int n;
	Points points = new Points();
	int point1, point2;
	float[] selectedPoint1 = new float[2];
	float[] selectedPoint2 = new float[2];
	
	ArrayList<Float> xPoint = new ArrayList<>();
	ArrayList<Float> yPoint = new ArrayList<>();
	
	Random rand = new Random();


	CreateThread(int n) {
		this.n = n;
	}

	public CreateThread(ArrayList<Float> xPoint, ArrayList<Float> yPoint, int n) {
		// TODO Auto-generated constructor stub
		this.xPoint=xPoint;
		this.yPoint=yPoint;
		this.n=n;
	}

	void setNode(int n) {
		this.n = n;
	}
  
	void setPoint(int n) {
		points.generateRandomPoints(n);}
	
	void setPoints() {
//		Points points ;
		point1 = rand.nextInt(n);
		point2 = rand.nextInt(n);
		System.out.println("Point 1 "+point1);
		System.out.println("Point 2 "+point2);
		selectedPoint1[0]= xPoint.get(point1);
		selectedPoint1[1]= yPoint.get(point1);
		selectedPoint2[0]= xPoint.get(point2);
		selectedPoint2[1]= yPoint.get(point2);
		
//		selectedPoint1[0]= points.getxPoint(point1);
//		selectedPoint1[1]= points.getyPoint(point1);
//		selectedPoint2[0]= points.getxPoint(point2);
//		selectedPoint2[1]= points.getyPoint(point2);
//		selectedPoint1[1]= points[point1].getyPoint();
//		selectedPoint2[0]= points[point1].getxPoint();
//		selectedPoint2[1]= points[point1].getyPoint();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setPoints();
		System.out.println("Thread 1 : Coordinate 1 - ("+selectedPoint1[0]+","+selectedPoint1[1]+")");
		System.out.println("Thread 1 : Coordinate 2 - ("+selectedPoint2[0]+","+selectedPoint2[1]+")");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

//        System.out.println("Point x " + this.pointX+" and point y "+this.pointY+" is selected");}

	}
}
