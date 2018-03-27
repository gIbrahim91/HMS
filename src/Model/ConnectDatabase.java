package Model;
import java.sql.*;

import static java.lang.Class.forName;

public class ConnectDatabase {
    private String URL="jdbc:mysql://127.0.0.1:3306/Springs";
    private String USER="root";
    private String PASS="12345";
    Connection connection;

    public void getConnectionDB() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(URL,USER,PASS);
        Statement statement = connection.createStatement();
        //statement.executeUpdate();
    }

    public Connection getConnection() {
        return connection;
    }
}
