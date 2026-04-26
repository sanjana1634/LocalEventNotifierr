package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class NotifyUser {

    public static void notifyUser(int userId, int eventId) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO notifications (user_id, event_id) VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.setInt(2, eventId);

            ps.executeUpdate();
            con.close();

            System.out.println("Notification sent");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
