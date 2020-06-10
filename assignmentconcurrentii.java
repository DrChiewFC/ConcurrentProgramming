/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentconcurrentii;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author User
 */
public class assignmentconcurrentii {

	/**
	 * @param args the command line arguments
	 * @throws java.lang.InterruptedException
	 */
    private static long startTime = 0;
    private static long finishTime = 0;
    
	public static void main(String[] args) throws InterruptedException {
		// TODO code application logic here
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of points : ");
		int n = scan.nextInt();
		System.out.print("Enter number of threads : ");
		int t = scan.nextInt();
		while (t > n) {
			System.out.println("Number of thread must be less than number of points!");
			System.out.print("Enter number of threads : ");
			t = scan.nextInt();
		}
		System.out.print("Enter the duration for the program (in second): ");
		int m = scan.nextInt();
                
		
		Points points= new Points(n);
		points.generateRandomPoints(n);
		
		ExecutorService executeThread = Executors.newFixedThreadPool(t); 
                
//		To calculate duration
                int i=0;
                start();                
                while(timeTaken() <= m && i<t){                           
                        System.out.println(m);
//                        System.out.println("Time taken "+timeTaken());
                    	CreateThread thread= new CreateThread(points.xPoint, points.yPoint, n);
			executeThread.execute(thread);
//                      You may remove sleep() method
//                      For testing
                        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		i++;
                
                }
//                System.out.println("Time taken 2: "+timeTaken());
                executeThread.shutdownNow();
                
	}
        
        
        public static void start(){
        startTime = System.nanoTime();
        }

        public static void finish(){
            finishTime =System.nanoTime();
        }

        public static long timeTaken(){
            finish();
            return (finishTime-startTime)/1000000000;
        }

}

//final Timer timer = new Timer();
//                timer.scheduleAtFixedRate(new TimerTask() {
//                    int i = 6; // Time in seconds
//
//                    public void run() {
//                        System.out.println(i--);
//                        if (i < 0) {
//                            timer.cancel();
//                            mrt.setRun(false);
//                        }
//                    }
//                }, 0, 1000);
