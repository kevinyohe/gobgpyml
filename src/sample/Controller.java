package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    //MVC - MODEL _ VIEW _ CONTROLLER

    @FXML
    private TextField prefixnetTextbox;

    @FXML
    private TextField masklengthrangeTextbox;

    @FXML
    private Button addButton;

    @FXML
    private ListView prefixlistListView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        masklengthrangeTextbox.setText("INIT");

        prefixlistListView.getItems().add(0,"0TEST");
        prefixlistListView.getItems().add(1,"1TEST");
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               prefixlistListView.getItems().add(prefixnetTextbox.getText() + "," + masklengthrangeTextbox.getText());
            }
        });

    }


}
