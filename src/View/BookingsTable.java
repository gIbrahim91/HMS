package View;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookingsTable implements Initializable {

    @FXML
    private JFXHamburger menu_hamburger2;

    @FXML
    private JFXDrawer drawer;

    @FXML
    private Label current_option_label;

    @FXML
    private BorderPane main_content;

    @FXML
    private JFXButton logout_btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {

            VBox vbox = FXMLLoader.load(getClass().getResource("DrawerContent.fxml"));
            drawer.setSidePane(vbox);

            for(Node node : vbox.getChildren()){
                if (node.getAccessibleText()!=null){
                    node.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED,(e)->{
                        switch (node.getAccessibleText()){
                            case "new_bookings" :
                                try {
                                    main_content.getChildren().clear();
                                    AnchorPane pane = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
                                    main_content.getChildren().setAll(pane);
                                    break;
                                } catch (IOException e1) {
                                    e1.printStackTrace();
                                }
                        }
                    });
                }
            }

            HamburgerSlideCloseTransition transition2 = new HamburgerSlideCloseTransition(menu_hamburger2);
            transition2.setRate(-1);
            menu_hamburger2.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED,(e)->{
                transition2.setRate(transition2.getRate()*-1);
                transition2.play();
                if(drawer.isShown()){
                    drawer.close();
                }else{
                    drawer.open();
                }
            });
        } catch (IOException e) {
            Logger.getLogger(MainScene.class.getName()).log(Level.SEVERE, null, e);
        }


    }
}
