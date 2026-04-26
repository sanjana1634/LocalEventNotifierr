package connection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class ViewUsersUI extends JFrame {

    JTable table;
    DefaultTableModel model;

    public ViewUsersUI() {
        setTitle("View Users");
        setSize(500, 300);
        setLayout(new BorderLayout());

        model = new DefaultTableModel();
        table = new JTable(model);

        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Email");

        loadUsers();

        add(new JScrollPane(table), BorderLayout.CENTER);

        setVisible(true);
    }

    public void loadUsers() {
        try {
            Connection con = DBConnection.getConnection();

            // 🔍 SEARCH POPUP
            String name = JOptionPane.showInputDialog("Enter name to search:");

            String sql;
            PreparedStatement ps;

            if (name == null || name.trim().isEmpty()) {
                // If nothing entered → show all users
                sql = "SELECT * FROM users";
                ps = con.prepareStatement(sql);
            } else {
                // Search logic
                sql = "SELECT * FROM users WHERE name LIKE ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, "%" + name + "%");
            }

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email")
                });
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
