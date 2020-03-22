package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

    public class Controller {
        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextField login;

        @FXML
        private PasswordField password;

        @FXML
        private Button authSignInButton;

        @FXML
        private Button loginSignUpButton;
        @FXML
        void initialize(){
            authSignInButton.setOnAction(event ->{
                System.out.println("U pushed button Sign In");
            });
        };
    }

