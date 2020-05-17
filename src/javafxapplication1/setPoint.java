/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;


import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
/**
 *
 * @author Acer
 */
public class setPoint implements Initializable{
    
    pointNum enteredPoint;
    private int num;
    
    public void initData(pointNum p){
        enteredPoint = p;
        num = p.getPoint();
        System.out.println(num);
        setXY(num);
    }
    
    public void setXY(int n){
        Random rand = new Random();
		Points[] points = new Points[n];
		
		for(int i=0;i<n;i++) {
			points[i].setxPoint(rand.nextFloat());
			points[i].setyPoint(rand.nextFloat());

    }
    
    
    
    
}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


