package connection;

public class MainApp {

    public static void main(String[] args) {
    	new Dashboard();
    	 new LoginUI();

        AddUser.addUser("Sanjana", "sanjana@gmail.com");

        AddEvent.addEvent(
            "Tech Talk",
            "Java & JDBC",
            "2026-02-10",
            "Seminar Hall"
        );

        NotifyUser.notifyUser(1, 1);
    }
}
