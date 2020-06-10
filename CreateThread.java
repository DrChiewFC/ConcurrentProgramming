/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentconcurrentii;

import java.util.ArrayList;
import java.util.Random;

public class CreateThread implements Runnable {
        int attempt1 = 0;
        int attempt2 = 0;
        int exit1 =0;
        int exit2 = 0;
        boolean run = true;
	Points points = new Points();
	int n, point1, point2;
	ArrayList<Float> selectedPoint1 = new ArrayList<>(2);
        ArrayList<Float> selectedPoint2 = new ArrayList<>(2);
	ArrayList<Float> xPoint = new ArrayList<>();
	ArrayList<Float> yPoint = new ArrayList<>();

	Random rand = new Random();

	CreateThread(int n) {
		this.n = n;
	}

	public CreateThread(ArrayList<Float> xPoint, ArrayList<Float> yPoint, int n) {
		// TODO Auto-generated constructor stub
		this.xPoint = xPoint;
		this.yPoint = yPoint;
		this.n = n;
                 for(int i=0;i<2;i++) {
			selectedPoint1.add(null);
                        selectedPoint2.add(null);
		}
	}

//	void setPoint(int n) {
//		points.generateRandomPoints(n);
//	}

        public void setRun(boolean toSet) {
        run = false;
    }
	//to assign 2 coordinates for a thread
	void setPoints() {
               
		//generate random index to get random points
		point1 = rand.nextInt(n); //coordinate 1
		point2 = rand.nextInt(n); //coordinate 2
		
		//check if point1 is taken
		//if taken, generate new index for coordinate 1
		
                while(points.getxPoint(point1)==0 && this.attempt1<20){
			point1 = rand.nextInt(n);
                        this.attempt1++;                        
		}
                
                if(this.attempt1 == 20)
                {selectedPoint1.set(0, null);
                selectedPoint1.set(1, null);}
                else{
                selectedPoint1.set(0, xPoint.get(point1));
                selectedPoint1.set(1, yPoint.get(point1));
                this.exit1 = 20;}
		
		//check if point2 is taken
		//if taken, generate new index for coordinate 2
		while(points.getxPoint(point2)==0 && this.attempt2<20){
			point2 = rand.nextInt(n);
                        this.attempt2++;
		}
                
                if(this.attempt2 == 20)
                {selectedPoint2.set(0, null);
                selectedPoint2.set(1, null);}
                else{
                selectedPoint2.set(0, xPoint.get(point2));
                selectedPoint2.set(1, yPoint.get(point2));
                this.exit2 = 20;}
		
	}

	@Override
	public void run() {
		
            while(exit1<20 && exit2<20){
            setPoints();
		System.out.println("Thread "+Thread.currentThread().getName()+" : Coordinate 1 - (" + selectedPoint1.get(0) + "," + selectedPoint1.get(1) + "), Coordinate 2 - (" + selectedPoint2.get(0) + "," + selectedPoint2.get(1) + ")");
		System.out.println("Thread "+Thread.currentThread().getName()+" : Selected Point 1 : " + point1 + ", Selected Point 2 : " + point2);
//		System.out.println("Thread "+Thread.currentThread().getName()+points.getIsTaken());
		System.out.println(Thread.currentThread().getName()+ " Attempt 1: "+ attempt1);
                System.out.println(Thread.currentThread().getName()+ " Attempt 2: "+ attempt2);
//                 try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
            }
	}
}
// 1 thread, 2 coordinates(x-y, x-y) point1 = (4,4), point2=(7,1) 
// x= [1,2,3,4(point1),5,6,7(point2)]
// y= [7,6,5,4(point1),3,2,1(point2)]
