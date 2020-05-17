/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class ResultController implements Initializable {
    private pointNum input;
    private int point;
    private int thread;
    private int duration;

    @FXML
    private Label lpo;
    @FXML
    private Label ldur;
    @FXML
    private Label lthr;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void initData(pointNum p) {
       input =p;
       point = input.getPoint();
       thread = input.getThread();
       duration = input.getDuration();
       
       lpo.setText(Integer.toString(point));
       lthr.setText(Integer.toString(thread));
       ldur.setText(Integer.toString(duration));
       
       //setXY(point);
       
       
    }
    
    public void setXY(int p){
        Random rand = new Random();
		Points[] points = new Points[p];
		
		for(int i=0;i<p;i++) {
			points[i].setxPoint(rand.nextFloat());
			points[i].setyPoint(rand.nextFloat());
		}

    }
    
    

   
    
}
