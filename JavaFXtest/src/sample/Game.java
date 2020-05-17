/**
 * 
 */
package sample;

import java.util.Random;
import java.util.Scanner;

/**
 * @author user
 *
 */
public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of points : ");
		int n = scan.nextInt();
		System.out.print("Enter number of threads : ");
		int t = scan.nextInt();
		while(t>n) {
			System.out.println("Number of thread must be less than number of points!");
			System.out.print("Enter number of threads : ");
			t = scan.nextInt();
		}
		System.out.print("Enter the duration for the program : ");
		int m = scan.nextInt();
		
		Random rand = new Random();
		Points[] points = new Points[n];
		
		for(int i=0;i<n;i++) {
			points[i].setxPoint(rand.nextFloat());
			points[i].setyPoint(rand.nextFloat());
		}
		
	}

}
