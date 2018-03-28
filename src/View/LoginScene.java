package View;

import Model.ConnectDatabase;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.sql.*;
import java.io.IOException;

public class LoginScene {

    String username = "";
    String password = "";

    @FXML
    private JFXTextField username_input;

    @FXML
    private JFXPasswordField password_input;

    @FXML
    private JFXButton login_button;

    @FXML
    private Label wrong_login_info;

    public JFXTextField getUsername_input() {
        return username_input;
    }

    public void userLogin() throws SQLException {

        ConnectDatabase db = new ConnectDatabase();
        Connection connection = DriverManager.getConnection(db.getURL(), db.getUSER(), db.getPASS());
        Statement statement = connection.createStatement();
        String sql = "SELECT Username,Password FROM Admin WHERE Username ='"+getUsername_input().getText()+"'";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            username = resultSet.getString("Username");
            password = resultSet.getString("Password");
        }

        login_button.setOnAction(e -> {
            if ((username_input.getText().equals(username) && username.isEmpty()==false) &&
                    (password_input.getText().equals(password) && password_input.getText().isEmpty()==false)) {
                View.MainScene ms = new MainScene();
                username_input.getScene().getWindow().hide();
                System.out.println(username+" "+password_input);
                try {
                    ms.openMainScreen();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }else if (username_input.getText().isEmpty() && password_input.getText().isEmpty()) {
                wrong_login_info.setText("ENTER username and password");
            } else {
                wrong_login_info.setText("WRONG username and password");
            }
        });

        connection.close();
    }

}