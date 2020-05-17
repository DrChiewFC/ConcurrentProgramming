/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class NumThreadController implements Initializable {

    private pointNum poEntered;
    private int numPoint;
    @FXML
    private TextField t;
    @FXML
    private Label labelt;
    
    //private pointNum point;
    @FXML
    private Label label1;
    @FXML
    private Button btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML
    public void handleButtonAction(ActionEvent event) throws IOException{
     
        int th = Integer.parseInt( t.getText());
        int po = getPoint();
        System.out.println(po);
        if (th>po){
            label1.setText("Number of thread must be less than number of points!");
          
            
        }
        else{   
        pointNum a = new pointNum();
        a.setPoint(po);
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("duration.fxml"));
        Parent duration = loader.load();
        
        Scene durationScene = new Scene(duration);
        
        //access the controller and call a method
        DurationController controller = loader.getController();
        controller.initData(a);
        
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(durationScene);
        window.show();
          
        }
    }
    
     public void initData(pointNum po)
    {
       poEntered = po;
       int num = poEntered.getPoint();
       setPoint(num);
    }
     
    public void setPoint(int n){
        numPoint = n;
    }
    
    public int getPoint(){
        return numPoint;
    }
    
}
