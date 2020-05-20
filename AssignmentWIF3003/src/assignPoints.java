/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maingame;

/**
 *
 * @author User
 */
public class assignPoints implements Runnable{
    float pointX;
    float pointY;
    int n;
    
    Points points = new Points();
    
    assignPoints(){
    
    }
    
    void setPoint(int n) {
        points.generateRandomPoints(n);}
    
    void setTime(int n){
    this.n = n; }
        
    @Override
    public void run() {  
    
        System.out.println("Point x " + this.pointX+" and point y "+this.pointY+" is selected");}
    
}
