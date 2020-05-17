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
public class DurationController implements Initializable {
       pointNum po;
       private int num;
       private TextField m;
    @FXML
    private Label label;
    @FXML
    private Button btn;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
     public void handleButtonAction(ActionEvent event) throws IOException {
        int n = getPoint();
      pointNum b = new pointNum();
        b.setPoint(n);
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("setPoint.fxml"));
        Parent setParent = loader.load();
        
        Scene durationScene = new Scene(setParent);
        
        //access the controller and call a method
       setPoint controller = loader.getController();
        controller.initData(b);
        
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(durationScene);
        window.show();
          
       
     
    }
    
    public void initData(pointNum p){
        po = p;
        setPoint(po.getPoint());
    }
    
     public void setPoint(int n){
        num = n;
    }
    
    public int getPoint(){
        return num;
    }
    
}
