package sakila;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    private String hostname = "localhost:8085";
    private String dbname = "sakila";
    private String username = "root";
    private String password = "123";

    private String connectionURL = "jdbc:mysql://" + hostname + "/" + dbname;

    public Connection connect() {
        //Tạo đối tượng Connection
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("kết nối thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
