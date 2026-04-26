package connection;
import javax.swing.*;

public class NotifyUI extends JFrame {

    public NotifyUI() {
        setTitle("Send Notification");
        setSize(300, 200);
        setLayout(null);

        JLabel userId = new JLabel("User ID:");
        JLabel eventId = new JLabel("Event ID:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        JButton send = new JButton("Send");

        userId.setBounds(20, 20, 100, 25);
        eventId.setBounds(20, 60, 100, 25);

        t1.setBounds(120, 20, 100, 25);
        t2.setBounds(120, 60, 100, 25);

        send.setBounds(100, 100, 100, 30);

        add(userId); add(eventId);
        add(t1); add(t2);
        add(send);

        send.addActionListener(e -> {
            NotifyUser.notifyUser(
                Integer.parseInt(t1.getText()),
                Integer.parseInt(t2.getText())
            );
            JOptionPane.showMessageDialog(this, "Notification Sent!");
        });

        setVisible(true);
    }
}