package connection;
import javax.swing.*;

public class AddUserUI extends JFrame {

    public AddUserUI() {
        setTitle("Add User");
        setSize(300, 200);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");

        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();

        JButton submit = new JButton("Submit");

        nameLabel.setBounds(20, 20, 80, 25);
        emailLabel.setBounds(20, 60, 80, 25);

        nameField.setBounds(100, 20, 150, 25);
        emailField.setBounds(100, 60, 150, 25);

        submit.setBounds(100, 100, 100, 30);

        add(nameLabel);
        add(emailLabel);
        add(nameField);
        add(emailField);
        add(submit);

        submit.addActionListener(e -> {
            AddUser.addUser(
                nameField.getText(),
                emailField.getText()
            );
            JOptionPane.showMessageDialog(this, "User Added!");
        });

        setVisible(true);
    }
}