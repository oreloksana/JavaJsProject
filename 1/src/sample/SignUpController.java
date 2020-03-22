package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpSurname;

    @FXML
    private TextField signUpCountry;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private CheckBox signUpCheckBoxFemale;

}