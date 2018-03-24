package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.ResourceBundle;


public class MainScene implements Initializable {


    @FXML
    private JFXButton logout_btn;

    @FXML
    private JFXButton clear_booking_btn;

    @FXML
    private JFXButton update_booking_btn;

    @FXML
    private Label in;

    @FXML
    private JFXComboBox<?> checkin_month;

    @FXML
    private JFXComboBox<?> checkout_year;

    @FXML
    private JFXTextArea cust_address;

    @FXML
    private JFXButton admin_login_btn;

    @FXML
    private JFXButton done_booking_btn;

    @FXML
    private Label label_menu_option;

    @FXML
    private JFXTextField cust_mobile;

    @FXML
    private JFXComboBox<?> checkin_year;

    @FXML
    private JFXComboBox<String> roomtype;

    @FXML
    private JFXComboBox<?> checkout_day;

    @FXML
    private JFXTextField noofperson;

    @FXML
    private JFXComboBox<?> checkout_month;

    @FXML
    private JFXTextField cust_email;

    @FXML
    private JFXComboBox<Integer> checkin_day;


    @FXML
    private JFXTextField cust_name;

    @FXML
    private JFXTextField cust_surname;

    @FXML
    private JFXButton make_booking_btn;

    @FXML
    private JFXButton cancel_booking_btn;

    JFXComboBox combo = new JFXComboBox<>();


    public void openMainScreen() throws IOException {
        Parent root2 = FXMLLoader.load(getClass().getResource("mainScene.fxml"));
        Stage window = new Stage();
        window.setTitle("Springs Management System");
        window.setScene(new Scene(root2, 979, 600));
        window.setResizable(false);
        window.show();
    }

    public void userLogout() {
        logout_btn.setOnAction(e -> {
            //button should put up to confirm logging out
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Dialog");
            alert.setHeaderText("are you sure you want to logout?");
            Optional<ButtonType> results = alert.showAndWait();
            if (results.get() == ButtonType.OK) {
                logout_btn.getScene().getWindow().hide();
                Main m = new Main();
                try {
                    m.start(m.getPrimaryStage());
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            } else {
                alert.close();
            }
        });
    }

    public void clearForm() {
        clear_booking_btn.setOnAction(e -> {
            cust_name.setText("");
            cust_surname.setText("");
            cust_email.setText("");
            cust_mobile.setText("");
            cust_address.setText("");
            noofperson.setText("");
        });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        roomtype.getItems().add("Standard");
        roomtype.getItems().add("Deluxe");
        roomtype.getItems().add("Executive");
        roomtype.getItems().add("Presidential");

        //manual add days, month and year
    }
}