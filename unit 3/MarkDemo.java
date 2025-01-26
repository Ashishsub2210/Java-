import java.awt.*;
import java.awt.event.*;

public class MarkDemo extends Frame {

    Label l1, l2, l3, resultLabel;
    TextField tf1, tf2, tf3;
    Button btnCalculate;

    public MarkDemo() {
        setTitle("MarkDemo");
        setSize(400, 400);
        setLayout(new FlowLayout());

        l1 = new Label("Science:");
        tf1 = new TextField();
        add(l1);
        add(tf1);

        l2 = new Label("Math:");
        tf2 = new TextField();
        add(l2);
        add(tf2);

        l3 = new Label("English:");
        tf3 = new TextField();
        add(l3);
        add(tf3);

        btnCalculate = new Button("Calculate");
        add(btnCalculate);

        resultLabel = new Label("Grade : ");
        add(resultLabel);

        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int science = Integer.parseInt(tf1.getText());
                int math = Integer.parseInt(tf2.getText());
                int english = Integer.parseInt(tf3.getText());
                int total = science + math + english;
                int average = total / 3;

                String grade = "";
                if (average < 40) {
                    grade = "C";
                } else if (average < 50) {
                    grade = "B";
                } else if (average < 70) {
                    grade = "B+";
                } else if (average < 90) {
                    grade = "A+";
                }

                resultLabel.setText("Grade: " + grade);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MarkDemo();
    }
}
