package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.animations.Shake;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {

    @FXML
    private Button enter;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private Button link;

    @FXML
    void initialize(){
        link.setOnAction(event -> {
            openNewScene("main.fxml");
        });
        enter.setOnAction(event -> {
            String loginText = login.getText().trim();
            String passwordText = password.getText().trim();

            if(!loginText.equals("")&&!passwordText.equals("")){
                try {
                    loginUser(loginText, passwordText);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
            else {
                System.out.println("Login and password is empty");
                Shake userLoginAnim = new Shake(login);
                Shake userPasswordAnim = new Shake(password);

                userLoginAnim.playAnim();
                userPasswordAnim.playAnim();
            }
        });
    }


    private void loginUser(String loginText, String passwordText) throws SQLException, ClassNotFoundException {
        DatabaseHandler dbHandler = new DatabaseHandler();
        User user = new User();
        user.setLogin(loginText);
        user.setPassword(passwordText);
        ResultSet result = dbHandler.getUser(user);

        int counter = 0;

        while (result.next()) {
            counter++;
        }

        if(counter>=1) {
            System.out.println("Success!");
            //openNewScene("main.fxml");
        }

        else{
            Shake userLoginAnim = new Shake(login);
            Shake userPasswordAnim = new Shake(password);

            userLoginAnim.playAnim();
            userPasswordAnim.playAnim();
        }

    }

    public void openNewScene(String window){
        enter.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(window));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setMaximized(true);
            stage.showAndWait();
        };
    }



