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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
 

/**
 *
 * @author Acer
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField n;
    @FXML
    private Button okbtn;
  //  private pointNum p;
    
    public void handleButtonAction(ActionEvent event) throws IOException {
        
      int num = Integer.parseInt(n.getText());
      pointNum p = new pointNum();
      p.setPoint(num);
      
     //setPoint s = new setPoint();
    
       FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("numThread.fxml"));
        Parent numThread = loader.load();
        
        Scene numThreadScene = new Scene(numThread);
        
        //access the controller and call a method
        NumThreadController controller = loader.getController();
        controller.initData(p);
        
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(numThreadScene);
        window.show();
       
     
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    
    
}
