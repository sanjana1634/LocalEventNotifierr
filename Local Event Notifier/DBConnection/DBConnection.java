package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            String url =
                "jdbc:mysql://localhost:3306/local_event_db"
                + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

            String user = "root";
            String password = "lily123";   // ✅ your real password

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected");
            return con;

        } catch (Exception e) {
            System.out.println("Database Connection Failed");
            e.printStackTrace();
            return null;
        }
    }
}
