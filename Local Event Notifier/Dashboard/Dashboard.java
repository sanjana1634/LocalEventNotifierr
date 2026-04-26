package connection;

import javax.swing.*;

public class Dashboard extends JFrame {

    public Dashboard() {
        setTitle("Student Management System");
        setSize(400, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton addUserBtn = new JButton("Add User");
        JButton addEventBtn = new JButton("Add Event");
        JButton notifyBtn = new JButton("Send Notification");
        JButton exitBtn = new JButton("Exit");

        JButton viewUsersBtn = new JButton("View Users");
        JButton viewEventsBtn = new JButton("View Events");

        addUserBtn.setBounds(100, 30, 200, 30);
        addEventBtn.setBounds(100, 80, 200, 30);
        notifyBtn.setBounds(100, 130, 200, 30);
        exitBtn.setBounds(100, 180, 200, 30);

        viewUsersBtn.setBounds(100, 230, 200, 30);
        viewEventsBtn.setBounds(100, 280, 200, 30);

        add(addUserBtn);
        add(addEventBtn);
        add(notifyBtn);
        add(exitBtn);
        add(viewUsersBtn);
        add(viewEventsBtn);

        // Actions
        addUserBtn.addActionListener(e -> new AddUserUI());
        addEventBtn.addActionListener(e -> new AddEventUI());
        notifyBtn.addActionListener(e -> new NotifyUI());

        viewUsersBtn.addActionListener(e -> new ViewUsersUI());
        viewEventsBtn.addActionListener(e -> new ViewEventsUI());

        exitBtn.addActionListener(e -> System.exit(0));

        getContentPane().setBackground(java.awt.Color.LIGHT_GRAY);

        setVisible(true);
    }
}