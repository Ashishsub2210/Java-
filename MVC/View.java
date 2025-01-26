import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JLabel nameLabel, displayLabel;
    private JTextField nameField;
    private JButton displayButton;

    public View(Controller controller) {
        setTitle("Display Name");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        displayLabel = new JLabel("Your Name will be displayed Here!!: ");
        nameLabel = new JLabel("Name: ");
        nameField = new JTextField(20);
        displayButton = new JButton("Display");

        // When the button is pressed, the controller's displayName method is called
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();  // Get name from the text field
                controller.displayName(name);       // Call the controller's method
            }
        });

        JPanel panel = new JPanel();
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(displayButton);
        panel.add(displayLabel);

        getContentPane().add(BorderLayout.CENTER, panel);
        setVisible(true);
    }

    // Updates the label with the student's name
    public void setStudentName(String name) {
        displayLabel.setText("Your Name is: " + name);
    }
}
