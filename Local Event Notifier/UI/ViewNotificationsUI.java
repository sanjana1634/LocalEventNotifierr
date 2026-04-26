package connection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ViewNotificationsUI extends JFrame {

    public ViewNotificationsUI() {
        setTitle("Notifications");
        setSize(500,300);

        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

        model.addColumn("User");
        model.addColumn("Event");

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT u.name, e.title FROM notifications n " +
                         "JOIN users u ON n.user_id=u.id " +
                         "JOIN events e ON n.event_id=e.id";

            ResultSet rs = con.createStatement().executeQuery(sql);

            while(rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("name"),
                    rs.getString("title")
                });
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        add(new JScrollPane(table));
        setVisible(true);
    }
}
