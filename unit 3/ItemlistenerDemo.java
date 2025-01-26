import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemlistenerDemo extends JFrame {

        JLabel resultLabel;
        JRadioButton maleButton, femaleButton;
        ButtonGroup group;

        public ItemlistenerDemo() {
        setTitle("Item Listener");
        setSize(400, 200);
        setLayout(new FlowLayout());

        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");

        group = new ButtonGroup();
        group.add(maleButton);
        group.add(femaleButton);

        resultLabel = new JLabel("Select Gender");

        add(maleButton);
        add(femaleButton);
        add(resultLabel);

        maleButton.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent e) {
        if (maleButton.isSelected()) {
        resultLabel.setText("Male selected");
}
}
});

        femaleButton.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent e) {
        if (femaleButton.isSelected()) {
        resultLabel.setText("Female selected");
}
}
});

        setVisible(true);
        }

        public static void main(String[] args) {
        new ItemlistenerDemo();
}
}
