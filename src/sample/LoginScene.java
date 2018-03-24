            package sample;

            import com.jfoenix.controls.JFXButton;
            import com.jfoenix.controls.JFXPasswordField;
            import com.jfoenix.controls.JFXTextField;
            import javafx.event.ActionEvent;
            import javafx.event.Event;
            import javafx.fxml.FXML;
            import javafx.scene.control.*;
            import javafx.stage.Stage;

            import java.io.IOException;

            public class LoginScene {


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

                public void userLogin(){
                    login_button.setOnAction(e->{
                        if(username_input.getText().equals("") && password_input.getText().equals("")){
                            wrong_login_info.setText("enter username and password");
                        }else if (username_input.getText().equals("a") && password_input.getText().equals("1")){
                                sample.MainScene ms = new MainScene();
                                username_input.getScene().getWindow().hide();
                            try {
                                ms.openMainScreen();
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }
                        }else{
                            wrong_login_info.setText("wrong username and password");
                        }
                    });
                }


            }
