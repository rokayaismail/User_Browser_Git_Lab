package rokaya.salma.userbrowser.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import rokaya.salma.userbrowser.model.User;
import javafx.scene.control.TextField;
import rokaya.salma.userbrowser.controller.Controller;

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

    Controller controller;
    User user = null;
    boolean click = false;

    public FXMLController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //salma 
        firstButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                user = controller.getFirstUser();
                displayUser(user);
            }
        });
        lastButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                user = controller.getLastUser();
                displayUser(user);
            }
        });
        prevButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                user = controller.getPrevUser();
                displayUser(user);
            }
        });
        nextButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                user = controller.getNextUser();
                displayUser(user);
            }
        });
        newButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!click) {
                    ID.setText("");
                    firstName.setText("");
                    lastName.setText("");
                    middleName.setText("");
                    email.setText("");
                    phone.setText("");
                    ID.setDisable(false);
                    prevButton.setDisable(true);
                    nextButton.setDisable(true);
                    lastButton.setDisable(true);
                    firstButton.setDisable(true);
                    updateButton.setDisable(true);
                    deleteButton.setDisable(true);
                    newButton.setText("ADD");
                    click = true;
                } else if (!(ID.getText().equals("") && firstName.getText().equals("") && lastName.getText().equals("") && email.getText().equals("") && phone.getText().equals(""))) {

                    user = new User(Integer.parseInt(ID.getText()), firstName.getText(), middleName.getText(), lastName.getText(),
                            email.getText(), phone.getText());
                    ID.setDisable(true);
                    prevButton.setDisable(false);
                    nextButton.setDisable(false);
                    lastButton.setDisable(false);
                    firstButton.setDisable(false);
                    updateButton.setDisable(false);
                    deleteButton.setDisable(false);
                    newButton.setText("New");
                    click = false;

                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Empty Fields");
                    String s = "Text should enter  valid text . ";
                    alert.setContentText(s);
                    alert.showAndWait();
                }

            }
        });
        deleteButton.setOnAction(new EventHandler<ActionEvent>() {
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

    void next() {

    }
}
