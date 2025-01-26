import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleTextField extends JFrame implements ActionListener {

    private JTextField first, second;
    private JButton add, sub, imgBtn;
    private JLabel result;

    public SimpleTextField() {
        init();
    }

    private void init() {
        setTitle("Simple Text Field");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        first = new JTextField(20);
        second = new JTextField(20);

        add = new JButton("Add +");
        sub = new JButton("Sub -");

        result = new JLabel("Result: ");

        add.addActionListener(this);
        sub.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel.add(first);
        panel.add(second);
        panel.add(result);
        panel.add(add);
        panel.add(sub);

        getContentPane().add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1, num2, resultInt;
        String resultStr;

        try {
            num1 = Integer.parseInt(first.getText());
            num2 = Integer.parseInt(second.getText());

            if (e.getSource() == add) {
                resultInt = num1 + num2;
            } else if (e.getSource() == sub) {
                resultInt = num1 - num2;
            } else {
                return;
            }

            resultStr = String.valueOf(resultInt);
            result.setText("Result: " + resultStr);
        } catch (NumberFormatException ex) {
            result.setText("Error: Please enter valid integers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleTextField();
            }
        });
    }
}