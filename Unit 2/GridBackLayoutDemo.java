import java.awt.*;

public class GridBackLayoutDemo extends Frame{

public GridBackLayoutDemo(){
this.setTitle("BUTTON");
this.setSize(400,400);
this.setLayout(new GridLayout(2,2));
this.setVisible(true);

Button b= new Button("Button");
add(b);
Button b1= new Button("Button");
add(b1);
Button b2= new Button("Button");
add(b2);
Button b3= new Button("Button");
add(b3);

}
public static void main(String[]args){
new GridBackLayoutDemo();
}
}
