package connection;

import javax.swing.*;

public class LoginUI extends JFrame {

    JTextField userField;
    JPasswordField passField;

    public LoginUI() {
        setTitle("Login");
        setSize(300, 200);
        setLayout(null);

        JLabel user = new JLabel("Username:");
        JLabel pass = new JLabel("Password:");

        userField = new JTextField();
        passField = new JPasswordField();

        JButton loginBtn = new JButton("Login");

        user.setBounds(20, 20, 100, 25);
        pass.setBounds(20, 60, 100, 25);

        userField.setBounds(120, 20, 140, 25);
        passField.setBounds(120, 60, 140, 25);

        loginBtn.setBounds(100, 110, 100, 30);

        add(user); add(pass);
        add(userField); add(passField);
        add(loginBtn);

        loginBtn.addActionListener(e -> {
            new Dashboard();
            dispose();
        });

        setVisible(true);
    }
}