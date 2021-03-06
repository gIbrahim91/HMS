    package View;

    import Model.ConnectDatabase;
    import javafx.application.Application;
    import javafx.fxml.FXMLLoader;
    import javafx.scene.Parent;
    import javafx.scene.Scene;
    import javafx.stage.Stage;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;


    public class Main extends Application {

        Stage primaryStage = new Stage();

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("loginScene.fxml"));
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(root, 900, 600));
            primaryStage.setResizable(false);
            primaryStage.show();
        }

        public Stage getPrimaryStage() {
            return primaryStage;
        }

        public static void main(String[] args) throws Exception {
            launch(args);
        }
    }
