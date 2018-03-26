package View;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BookingsScene implements Initializable{

    @FXML
    private AnchorPane anchor_pane_content;

    @FXML
    private JFXButton view_booking_btn;

    public void loadBookingScene() throws IOException {
        view_booking_btn.setOnAction(e -> {
            System.out.println("test");
        });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
