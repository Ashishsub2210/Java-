import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample extends JFrame {

        SwingExample() {
        setTitle("Swing");
        setSize(400, 400);
        setLayout(new FlowLayout());
        
        JButton b1 = new JButton("CLCIK");
        add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello Kella");
   }
    });
    }

    public static void main(String[] args) {
         new SwingExample();
        frame.setVisible(true);
    }
}
