import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame {

    public Login() {
        setTitle("Label and Icon");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1 = new JLabel("Username");
        label1.setBounds(120, 20, 70, 20);
        add(label1);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(120, 50, 70, 20);
        add(label2);

        JTextField t1 = new JTextField(20);
        t1.setBounds(150, 20, 150, 20);
        add(t1);

        JTextField t2 = new JTextField(20);
        t2.setBounds(150, 50, 150, 20);
        add(t2);

        JButton b1 = new JButton("Login");
        b1.setBounds(150, 80, 100, 30);
        add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = t1.getText();
                String pass = t2.getText();

                if (user.length() >= 5 && pass.length() >= 5) {
                    if (user.equals(pass)) {
                        System.out.println("Success");
                    } else {
                        System.out.println("Failed");
                    }
                } else {
                    System.out.println("must 5  long");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login();
            }
        });
    }
}
