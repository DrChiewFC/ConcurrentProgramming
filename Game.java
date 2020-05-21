package assignmentWIF3003;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author User
 */
public class Game {

	/**
	 * @param args the command line arguments
	 * @throws java.lang.InterruptedException
	 */
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
		System.out.print("Enter the duration for the program : ");
		int m = scan.nextInt();
		
		Points points= new Points();
		points.generateRandomPoints(n);
		
		ExecutorService executeThread = Executors.newFixedThreadPool(t);
		
		for(int i=0; i<t; i++) {
			CreateThread thread= new CreateThread(points.xPoint, points.yPoint, n);
			executeThread.execute(thread);
		}
	}

}