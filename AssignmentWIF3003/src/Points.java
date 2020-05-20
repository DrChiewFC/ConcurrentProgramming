/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maingame;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public class Points{
	
    ArrayList<Float> xPoint = new ArrayList<>();
    ArrayList<Float> yPoint = new ArrayList<>();
        
	public Points() {
		
	}
	
        public void generateRandomPoints(int n){
            
            Random rand = new Random();
            for(int i=0;i<n;i++) {
		xPoint.add(rand.nextFloat()* (1000-0) + 0);
		yPoint.add(rand.nextFloat()* (1000-0) + 0);
            
                for(int j=xPoint.size(); j>0; j--){
                    while(xPoint.get(j).equals(xPoint.get(j-1)>0)){
                        xPoint.set(j, rand.nextFloat()* (1000-0) + 0);
                    }
                    while(yPoint.get(j).equals(yPoint.get(j-1)>0)){
                        yPoint.set(j, rand.nextFloat()* (1000-0) + 0);
                    }
                }
            }
                
            
        }
}