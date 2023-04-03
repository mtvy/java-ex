import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserView extends JFrame {
    private JLabel firstNameLabel = new JLabel("First name:");
    private JLabel lastNameLabel = new JLabel("Last name:");
    private JLabel firstNameValueLabel = new JLabel();
    private JLabel lastNameValueLabel = new JLabel();

    public UserView() {
        setTitle("User View");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(firstNameLabel);
        add(firstNameValueLabel);
        add(lastNameLabel);
        add(lastNameValueLabel);

        setVisible(true);
    }

    public void setFirstName(String firstName) {
        firstNameValueLabel.setText(firstName);
    }

    public void setLastName(String lastName) {
        lastNameValueLabel.setText(lastName);
    }
}
