package rokaya.salma.userbrowser.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import rokaya.salma.userbrowser.model.User;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

    @FXML
    private Button newButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button firstButton;

    @FXML
    private Button prevButton;

    @FXML
    private Button nextButton;

    @FXML
    private Button lastButton;

    @FXML
    private TextField ID;

    @FXML
    private TextField firstName;

    @FXML
    private TextField middleName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField email;

    @FXML
    private TextField phone;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //salma 
        firstButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        //rokaya
    }

    void displayUser(User user) {
        ID.setText("" + user.getId());
        firstName.setText(user.getFirstName());
        lastName.setText(user.getLastName());
        middleName.setText(user.getMiddleName());
        email.setText(user.getEmail());
        phone.setText(user.getPhoneNumber());
    }
}
