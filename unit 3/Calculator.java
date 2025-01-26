import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        Frame frame = new Frame("Calculator");
        frame.setSize(400, 300);
        frame.setLayout(null);
        Label label1 = new Label("Number 1:");
        label1.setBounds(50, 50, 80, 30);
        frame.add(label1);
        Label label2 = new Label("Number 2:");
        label2.setBounds(50, 100, 80, 30);
        frame.add(label2);
        Label labelResult = new Label("Result:");
        labelResult.setBounds(50, 150, 80, 30);
        frame.add(labelResult);
        TextField text1 = new TextField();
        text1.setBounds(140, 50, 100, 30);
        frame.add(text1);
        TextField text2 = new TextField();
        text2.setBounds(140, 100, 100, 30);
        frame.add(text2);
        TextField textResult = new TextField();
        textResult.setBounds(140, 150, 100, 30);
        textResult.setEditable(false);
        frame.add(textResult);
        Button buttonAdd = new Button("+");
        buttonAdd.setBounds(50, 200, 50, 30);
        frame.add(buttonAdd);
        Button buttonSubtract = new Button("-");
        buttonSubtract.setBounds(110, 200, 50, 30);
        frame.add(buttonSubtract);
        Button buttonMultiply = new Button("*");
        buttonMultiply.setBounds(170, 200, 50, 30);
        frame.add(buttonMultiply);
        Button buttonDivide = new Button("/");
        buttonDivide.setBounds(230, 200, 50, 30);
        frame.add(buttonDivide);

        buttonAdd.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        String num1 = text1.getText();
        String num2 = text2.getText();
        if (isNumeric(num1) && isNumeric(num2)) {
        double result = Double.parseDouble(num1) + Double.parseDouble(num2);
        textResult.setText(String.valueOf(result));
} else {
        textResult.setText("Invalid Input");
}
}
});

        buttonSubtract.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        String num1 = text1.getText();
        String num2 = text2.getText();
        if (isNumeric(num1) && isNumeric(num2)) {
        double result = Double.parseDouble(num1) - Double.parseDouble(num2);
        textResult.setText(String.valueOf(result));
 } else {
        textResult.setText("Invalid Input");
 }
 }
 });

        buttonMultiply.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        String num1 = text1.getText();
        String num2 = text2.getText();
        if (isNumeric(num1) && isNumeric(num2)) {
        double result = Double.parseDouble(num1) * Double.parseDouble(num2);
        textResult.setText(String.valueOf(result));
        } else {
        textResult.setText("Invalid Input");
 }
 }
 });

        buttonDivide.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        String num1 = text1.getText();
        String num2 = text2.getText();
        if (isNumeric(num1) && isNumeric(num2)) {
        if (!num2.equals("0")) {
        double result = Double.parseDouble(num1) / Double.parseDouble(num2);
        textResult.setText(String.valueOf(result));
        } else {
        textResult.setText("Cannot Divide by 0");
 }
       } else {
       textResult.setText("Invalid Input");
 }
  }
 });

        frame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
        frame.dispose();
}
});

       frame.setVisible(true);
}

    public static boolean isNumeric(String str) {
    if (str == null || str.isEmpty()) {
    return false;
        }
    for (char c : str.toCharArray()) {
    if (!Character.isDigit(c) && c != '.') {
    return false;
    }
    }
    return true;
  }
}
