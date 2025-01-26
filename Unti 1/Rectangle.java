import java.awt.*;
public class Rectangle{

public static void main (String[] args){
Frame frame = new Frame();
frame.setTitle("Draw");
frame.setSize(400,400);
frame.setLayout(null);
frame.setVisible(true);
Label label = new Label("Hello");
label.setBounds(30,40,30, 50);
frame.add(label);
}
}