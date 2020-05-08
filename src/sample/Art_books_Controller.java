package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class Art_books_Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView img_background;

    @FXML
    private Label pan1;

    @FXML
    private ImageView img1;

    @FXML
    private Label pan2;

    @FXML
    private ImageView img2;

    @FXML
    private Label pan3;

    @FXML
    private ImageView img3;

    @FXML
    private Label book_name1;

    @FXML
    private Label book_name2;

    @FXML
    private Label book_name3;

    @FXML
    private Label author_name1;

    @FXML
    private Label author_name2;

    @FXML
    private Label author_name3;

    @FXML
    private Button add1;

    @FXML
    private Button add2;

    @FXML
    private Button back;

    @FXML
    private Button add3;

    @FXML
    void initialize() {
        assert img_background != null : "fx:id=\"img_background\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert pan1 != null : "fx:id=\"pan1\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert img1 != null : "fx:id=\"img1\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert pan2 != null : "fx:id=\"pan2\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert img2 != null : "fx:id=\"img2\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert pan3 != null : "fx:id=\"pan3\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert img3 != null : "fx:id=\"img3\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert book_name1 != null : "fx:id=\"book_name1\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert book_name2 != null : "fx:id=\"book_name2\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert book_name3 != null : "fx:id=\"book_name3\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert author_name1 != null : "fx:id=\"author_name1\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert author_name2 != null : "fx:id=\"author_name2\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert author_name3 != null : "fx:id=\"author_name3\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert add1 != null : "fx:id=\"add1\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert add2 != null : "fx:id=\"add2\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'Art_books.fxml'.";
        assert add3 != null : "fx:id=\"add3\" was not injected: check your FXML file 'Art_books.fxml'.";

    }
}
