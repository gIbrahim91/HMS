package sample;

import com.sun.org.apache.xml.internal.security.Init;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MainScene {


    public void openMainScreen() throws IOException {
        Parent root2 = FXMLLoader.load(getClass().getResource("mainScene.fxml"));
        Stage window = new Stage();
        window.setTitle("Springs Management System");
        window.setScene(new Scene(root2, 979, 600));
        window.setResizable(false);
        window.show();
    }

}
