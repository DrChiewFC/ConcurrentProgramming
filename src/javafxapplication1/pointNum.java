/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 *
 * @author Acer
 */
class pointNum {
    
    int point;
    int thread;
    int duration;

    public pointNum(int point) {
        this.point = point;
    }
    
    public pointNum(){
        
    }
     
    public void setPoint(int p){
        point = p;
    }
    
    public int getPoint(){
        return point;
    }
    
     public void setThread(int t){
        thread = t;
    }
    
    public int getThread(){
        return thread;
    }
    
     public void setDuration(int m){
        duration = m;
    }
    
    public int getDuration(){
        return duration;
    }
    
}
