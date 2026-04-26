package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddEvent {

    public static void addEvent(String title, String desc, String date, String location) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO events (title, description, event_date, location) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, desc);
            ps.setString(3, date);
            ps.setString(4, location);

            ps.executeUpdate();
            con.close();

            System.out.println("Event added");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
