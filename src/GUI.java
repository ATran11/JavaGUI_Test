import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {

        JPanel panel = new JPanel();

        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        // User Information
        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);


        // Password Information
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        // Login Button
        button = new JButton("Login");
        button.setBounds(184, 100, 80, 25);
        panel.add(button);

        // Check verification.
        success = new JLabel("");
        success.setBounds(10, 120, 300, 25);
        button.addActionListener(new GUI());
        panel.add(success);

        // Makes every object we create visible.
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        if (user.equals("Anthony") && password.equals("Password123")) {
            success.setText("Login successful!");
        } else {
            // Resets the text boxes
            success.setText("Login is incorrect :(");
            userText.setText("");
            passwordText.setText("");
        }
    }
}

