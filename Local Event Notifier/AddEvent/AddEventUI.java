package connection;
import javax.swing.*;

public class AddEventUI extends JFrame {

    public AddEventUI() {
        setTitle("Add Event");
        setSize(350, 300);
        setLayout(null);

        JLabel title = new JLabel("Title:");
        JLabel desc = new JLabel("Description:");
        JLabel date = new JLabel("Date:");
        JLabel loc = new JLabel("Location:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JTextField t4 = new JTextField();

        JButton submit = new JButton("Submit");

        title.setBounds(20, 20, 100, 25);
        desc.setBounds(20, 60, 100, 25);
        date.setBounds(20, 100, 100, 25);
        loc.setBounds(20, 140, 100, 25);

        t1.setBounds(120, 20, 150, 25);
        t2.setBounds(120, 60, 150, 25);
        t3.setBounds(120, 100, 150, 25);
        t4.setBounds(120, 140, 150, 25);

        submit.setBounds(120, 200, 100, 30);

        add(title); add(desc); add(date); add(loc);
        add(t1); add(t2); add(t3); add(t4);
        add(submit);

        submit.addActionListener(e -> {
            AddEvent.addEvent(
                t1.getText(),
                t2.getText(),
                t3.getText(),
                t4.getText()
            );
            JOptionPane.showMessageDialog(this, "Event Added!");
        });

        setVisible(true);
    }
}