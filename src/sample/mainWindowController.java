package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class mainWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image_background;

    @FXML
    private Button art_button;

    @FXML
    private Button programming_button;

    @FXML
    private TextField search_textfield;

    @FXML
    private Button my_books_button;

    @FXML
    private Button adventure_button;

    @FXML
    private Button biography_button;

    @FXML
    private Label best_label;

    @FXML
    private ImageView best1_img;

    @FXML
    private ImageView best2_img;

    @FXML
    private ImageView best3_img;

    @FXML
    void initialize() {
        adventure_button.setOnAction(event -> {
            openNewScene("/sample/Adventure_books.fxml", adventure_button);
        });

    }

    private void openNewScene(String window, Button adventure_button) {
        adventure_button.getScene().getWindow().hide();
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
        stage.showAndWait();
    }
    }

