package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.*;

public class Controller {

    TextField points = new TextField();
    TextField threads = new TextField();
    TextField duration = new TextField();
    Button button = new Button();


     button.setOnAction(e -> {
        String n = String.valueOf(points.getText());
        String t = String.valueOf(threads.getText());
        String m = String.valueOf(duration.getText());
    });

}
