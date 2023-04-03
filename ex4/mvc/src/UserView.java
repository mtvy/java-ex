import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserView extends JFrame {
    private JLabel firstNameLabel = new JLabel("First name:");
    private JLabel lastNameLabel = new JLabel("Last name:");
    private JTextField firstNameTextField = new JTextField(20);
    private JTextField lastNameTextField = new JTextField(20);

    public UserView() {
        setTitle("User View");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(firstNameLabel);
        add(firstNameTextField);
        add(lastNameLabel);
        add(lastNameTextField);

        setVisible(true);
    }

    public String getFirstName() {
        return firstNameTextField.getText();
    }

    public String getLastName() {
        return lastNameTextField.getText();
    }

    public void setFirstName(String firstName) {
        firstNameTextField.setText(firstName);
    }

    public void setLastName(String lastName) {
        lastNameTextField.setText(lastName);
    }

    public void setController(UserController userController) {
    }
}
