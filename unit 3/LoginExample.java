import java.awt.*;
import java.awt.event.*;

public class LoginExample extends Frame {

    public LoginExample() {
        setTitle("Login Example");
        setSize(400, 400);
        setLayout(null);

        Label l1 = new Label("Username:");
        l1.setBounds(100, 100, 100, 20);
        add(l1);

        Label l2 = new Label("Password:");
        l2.setBounds(100, 200, 100, 20);
        add(l2);

        TextField t1 = new TextField(20);
        t1.setBounds(200, 100, 100, 20);
        add(t1);

        TextField t2 = new TextField(20);
        t2.setBounds(200, 200, 100, 20);
        t2.setEchoChar('*');
        add(t2);

        Button b1 = new Button("Login");
        b1.setBounds(200, 300, 100, 30);
        add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = t1.getText();
                String password = t2.getText();

                if (username.equals("admin") && password.equals("admin")) {
                    showDialog("Message: Login successful");
                } else {
                    showDialog("Message: Login unsuccessful");
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    private void showDialog(String message) {
        Dialog d = new Dialog(this, "Login Status", true);
        d.setLayout(new FlowLayout());
        Label lbl = new Label(message);
        d.add(lbl);
        Button ok = new Button("OK");
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.setVisible(false);
            }
        });
        d.add(ok);
        d.setSize(300, 150);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginExample();
    }
}
