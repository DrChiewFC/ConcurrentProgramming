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
    @FXML
    private TextField m;
    @FXML
    private TextField t;
    @FXML
    private Label warn;
    
    @FXML
    public void handleButtonAction(ActionEvent event) throws IOException {
        
      int num = Integer.parseInt(n.getText());
      int th = Integer.parseInt(t.getText());
      int du = Integer.parseInt(m.getText());
      
      if(th>num){
          warn.setText("Number of thread must be less than number of points!");
      }
      else{
           pointNum p = new pointNum();
      p.setPoint(num);
      p.setThread(th);
      p.setDuration(du);
      
     //setPoint s = new setPoint();
    
       FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("result.fxml"));
        Parent result = loader.load();
        
        Scene resultScene = new Scene(result);
        
        //access the controller and call a method
        ResultController controller = loader.getController();
        controller.initData(p);
        
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(resultScene);
        window.show();
       
      }
      
      
      
      
     
     
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    
    
}
