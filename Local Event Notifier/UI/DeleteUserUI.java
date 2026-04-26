package connection;

import javax.swing.*;
import java.sql.*;

public class DeleteUserUI extends JFrame {

    public DeleteUserUI() {
        setTitle("Delete User");
        setSize(300,200);
        setLayout(null);

        JTextField idField = new JTextField();
        JButton delete = new JButton("Delete");

        idField.setBounds(80,30,120,25);
        delete.setBounds(80,80,120,30);

        add(idField); add(delete);

        delete.addActionListener(e -> {
            try {
                Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM users WHERE id=?"
                );
                ps.setInt(1, Integer.parseInt(idField.getText()));
                ps.executeUpdate();

                JOptionPane.showMessageDialog(this,"Deleted");

            } catch(Exception ex) {
                ex.printStackTrace();
            }
        });

        setVisible(true);
    }
}