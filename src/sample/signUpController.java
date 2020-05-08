package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class signUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image_background;

    @FXML
    private TextField name_text;

    @FXML
    private TextField email_text;

    @FXML
    private Button back_button;

    @FXML
    private Button signUp_button;

    @FXML
    private TextField surname_text;

    @FXML
    private TextField login_text;

    @FXML
    private TextField password_text;

    @FXML
    void initialize() {
        back_button.setOnAction(event -> {
            back_button.getScene().getWindow().hide();

            FXMLLoader l=new FXMLLoader();
            l.setLocation(getClass().getResource("/sample/sample.fxml"));

            try{
                l.load();
            }catch (IOException e){
                e.printStackTrace();
            }

            Parent root=l.getRoot();
            Stage stage=new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });


        signUp_button.setOnAction(event -> {
            SignUpNewUser();
        });
    }

    private void SignUpNewUser() {
        DatabaseHandler dbHandler=new DatabaseHandler();

        String firstname=name_text.getText();
        String surname=surname_text.getText();
        String loginname=login_text.getText();
        String password=password_text.getText();
        String email=email_text.getText();

        User user=new User(firstname, surname, loginname, password,email );

        dbHandler.signUpUser(user);
    }
}
