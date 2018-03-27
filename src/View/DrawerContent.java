package View;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class DrawerContent {

    @FXML
    private JFXButton logout_btn1;

    public void userLogout() {
        logout_btn1.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Dialog");
            alert.setHeaderText("are you sure you want to logout?");
            Optional<ButtonType> results = alert.showAndWait();
            if (results.get() == ButtonType.OK) {
                try {
                    logout_btn1.getScene().getWindow().hide();
                    Main m = new Main();
                   m.start(m.getPrimaryStage());
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            } else {
                alert.close();
            }
        });
    }
}
