package View;

import com.jfoenix.controls.*;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import javax.xml.soap.Text;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainScene implements Initializable {

    @FXML
    private JFXButton make_booking_btn;

    @FXML
    private JFXButton admin_login_btn;

    @FXML
    private JFXButton logout_btn;

    @FXML
    private JFXButton view_booking_btn;

    @FXML
    private JFXTextField cust_name;

    @FXML
    private JFXTextField cust_surname;

    @FXML
    private JFXTextField cust_email;

    @FXML
    private JFXComboBox<String> cust_title;

    @FXML
    private JFXTextField cust_mobile;

    @FXML
    private JFXTextField cust_house_number;

    @FXML
    private JFXTextField cust_street;

    @FXML
    private JFXTextField cust_city;

    @FXML
    private JFXTextField cust_postcode;

    @FXML
    private JFXTextField noofpersons;

    @FXML
    private JFXDatePicker checkin;

    @FXML
    private JFXDatePicker checkout;

    @FXML
    private JFXButton clear_booking_btn;

    @FXML
    private JFXButton complete_booking_btn;

    @FXML
    private JFXComboBox<String> roomtype;

    @FXML
    private BorderPane main_content;

    @FXML
    private JFXHamburger menu_hamburger;

    @FXML
    private JFXDrawer drawer;

    @FXML
    private Label current_option_label;

    @FXML
    private AnchorPane bookings_table_anchor;

    @FXML
    private AnchorPane anchor_pane_content;

    @FXML
    private Label booking_form_empty1;

    @FXML
    private Label booking_form_empty2;

    @FXML
    private Label booking_form_empty3;

    @FXML
    private Label booking_form_empty4;

    @FXML
    private Label booking_form_empty5;

    @FXML
    private Label booking_form_empty6;

    @FXML
    private Label booking_form_empty7;

    @FXML
    private Label booking_form_empty8;

    @FXML
    private Label booking_form_empty9;

    @FXML
    private Label booking_form_empty10;

    @FXML
    private JFXTextField cust_mobilenum;

    public void openMainScreen() throws IOException {
        Parent root2 = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        Stage window = new Stage();
        window.setTitle("Springs Management System");
        window.setScene(new Scene(root2, 1036, 750));
        window.setResizable(false);
        window.show();
    }

    public void clearForm(){
            cust_name.setText("");
            cust_name.setUnFocusColor(Paint.valueOf("#4d4d4d"));
            cust_surname.setText("");
            cust_surname.setUnFocusColor(Paint.valueOf("#4d4d4d"));
            cust_email.setText("");
            cust_email.setUnFocusColor(Paint.valueOf("#4d4d4d"));
            cust_mobilenum.setText("");
            cust_mobilenum.setUnFocusColor(Paint.valueOf("#4d4d4d"));
            cust_house_number.setText("");
            cust_house_number.setUnFocusColor(Paint.valueOf("#4d4d4d"));
            cust_city.setText("");
            cust_city.setUnFocusColor(Paint.valueOf("#4d4d4d"));
            noofpersons.setText("");
            noofpersons.setUnFocusColor(Paint.valueOf("#4d4d4d"));
            cust_postcode.setText("");
            cust_postcode.setUnFocusColor(Paint.valueOf("#4d4d4d"));
            cust_street.setText("");
            cust_street.setUnFocusColor(Paint.valueOf("#4d4d4d"));
            cust_title.getItems().clear();
            roomtype.getItems().clear();
            checkin.setValue(null);
            checkout.setValue(null);
            loadRoomType();
            loadNameTitle();
            roomtype.setPromptText("Room Type");
            cust_title.setPromptText("Title");
            booking_form_empty1.setText("");
            booking_form_empty2.setText("");
            booking_form_empty3.setText("");
            booking_form_empty4.setText("");
            booking_form_empty5.setText("");
            booking_form_empty6.setText("");
            booking_form_empty7.setText("");
            booking_form_empty8.setText("");
            booking_form_empty9.setText("");
            booking_form_empty10.setText("");

    }

    public void loadRoomType(){
        roomtype.getItems().add("Standard");
        roomtype.getItems().add("Deluxe");
        roomtype.getItems().add("Executive");
        roomtype.getItems().add("Presidential");
    }

    public void loadNameTitle(){
        cust_title.getItems().add("Mr");
        cust_title.getItems().add("Mrs");
        cust_title.getItems().add("Miss");
        cust_title.getItems().add("Dr.");
    }

    public void emptyFields(){
        ArrayList<JFXTextField> textfieldslist = new ArrayList<JFXTextField>();
        textfieldslist.add(cust_name);
        textfieldslist.add(cust_surname);
        textfieldslist.add(cust_email);
        textfieldslist.add(cust_house_number);
        textfieldslist.add(cust_street);
        textfieldslist.add(cust_city);
        textfieldslist.add(cust_postcode);
        textfieldslist.add(noofpersons);
        textfieldslist.add(cust_mobilenum);

        for (JFXTextField txt : textfieldslist) {
            if(txt.getText().isEmpty()){

                if(txt.equals(cust_name)){
                    booking_form_empty2.setText("*");
                    cust_name.setUnFocusColor(Paint.valueOf("#EF5350"));
                }

                if(txt.equals(cust_surname)){
                    booking_form_empty3.setText("*");
                    cust_surname.setUnFocusColor(Paint.valueOf("#EF5350"));
                }

                if(txt.equals(cust_email)){
                    booking_form_empty4.setText("*");
                    cust_email.setUnFocusColor(Paint.valueOf("#EF5350"));
                }

                if(txt.equals(cust_mobilenum)){
                    booking_form_empty5.setText("*");
                    cust_mobilenum.setUnFocusColor(Paint.valueOf("#EF5350"));
                }

                if(txt.equals(cust_house_number)){
                    booking_form_empty6.setText("*");
                    cust_house_number.setUnFocusColor(Paint.valueOf("#EF5350"));
                }
                if(txt.equals(cust_street)){
                    booking_form_empty7.setText("*");
                    cust_street.setUnFocusColor(Paint.valueOf("#EF5350"));
                }
                if(txt.equals(cust_city)){
                    booking_form_empty8.setText("*");
                    cust_city.setUnFocusColor(Paint.valueOf("#EF5350"));
                }
                if(txt.equals(cust_postcode)){
                    booking_form_empty9.setText("*");
                    cust_postcode.setUnFocusColor(Paint.valueOf("#EF5350"));
                }
                if(txt.equals(noofpersons)){
                    booking_form_empty10.setText("*");
                    noofpersons.setUnFocusColor(Paint.valueOf("#EF5350"));
                }
            }
        }
    }

    public void completeBooking(){
        complete_booking_btn.setOnAction(event -> {
            emptyFields();
        });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            VBox vbox = FXMLLoader.load(getClass().getResource("DrawerContent.fxml"));

            drawer.setSidePane(vbox);

            for(Node node : vbox.getChildren()){
                if (node.getAccessibleText()!=null){
                    node.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED,(e)->{
                        switch (node.getAccessibleText()){
                            case "view_bookings" :
                                try {
                                    AnchorPane pane = FXMLLoader.load(getClass().getResource("BookingsTable.fxml"));
                                    main_content.getChildren().setAll(pane);
                                    break;
                                } catch (IOException e1) {
                                    e1.printStackTrace();
                                }
                        }
                    });
                }
            }

            HamburgerSlideCloseTransition transition = new HamburgerSlideCloseTransition(menu_hamburger);
            transition.setRate(-1);
            menu_hamburger.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED,(e)->{
                transition.setRate(transition.getRate()*-1);
                transition.play();
                if(drawer.isShown()){
                    drawer.close();
                }else{
                    drawer.open();
                }
            });
        } catch (IOException e) {
            Logger.getLogger(MainScene.class.getName()).log(Level.SEVERE, null, e);
        }

        loadRoomType();
        loadNameTitle();

    }
}