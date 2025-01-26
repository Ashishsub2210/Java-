import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AreaofRectangle extends Applet implements ActionListener {
    TextField Length, Breadth, result;
    Button Calculatebtn;

    public void init() {
        setLayout(new FlowLayout());
        add(new Label("Length"));
        Length = new TextField(10);
        add(Length);
        add(new Label("Breadth"));
        Breadth = new TextField(10);
        add(Breadth);
        Calculatebtn = new Button("Calculate");
        Calculatebtn.addActionListener(this);
        add(Calculatebtn);
        add(new Label("Result"));
        result = new TextField(10);
        result.setEditable(false);
        add(result);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double length = Double.parseDouble(Length.getText());
            double breadth = Double.parseDouble(Breadth.getText());
            double area = length * breadth;
            result.setText(String.valueOf(area));
        } catch (NumberFormatException ex) {
            result.setText("Invalid");
        }
    }

    public void start() {
        
    }

    public static void main(String[] args) {
        AreaofRectangle applet = new AreaofRectangle();
        Frame frame = new Frame("Area of Rectangle");
        frame.setSize(300, 200);
        frame.add(applet);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }
}
