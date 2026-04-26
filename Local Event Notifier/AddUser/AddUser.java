package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddUser {

    public static void addUser(String name, String email) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);

            ps.executeUpdate();
            con.close();

            System.out.println("User added");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
