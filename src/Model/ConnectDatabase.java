package Model;
import java.sql.*;

import static java.lang.Class.forName;

public class ConnectDatabase {
    private String URL="jdbc:mysql://127.0.0.1:3306/Springs";
    private String USER="root";
    private String PASS="12345";

    public String getURL() {
        return URL;
    }

    public String getUSER() {
        return USER;
    }

    public String getPASS() {
        return PASS;
    }
}
