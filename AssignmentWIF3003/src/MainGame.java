/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maingame;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author User
 */
public class MainGame {

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
		while(t>n) {
			System.out.println("Number of thread must be less than number of points!");
			System.out.print("Enter number of threads : ");
			t = scan.nextInt();
		}
		System.out.print("Enter the duration for the program : ");
		int m = scan.nextInt();
                        
                assignPoints thread = new assignPoints();
                thread.setPoint(n);
                
                ExecutorService executeThread = Executors.newFixedThreadPool(t);
                executeThread.execute(thread);                
    }
   
}