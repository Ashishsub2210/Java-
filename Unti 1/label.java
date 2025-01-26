import java.awt.*;

public class LabelExample extends Frame{

public LabelExample(){
setTitle("label example");
setSize(400,400);
setLayout(null);
label l1 = new Label();
l1.setText("First Label");
l1.setBounds(20,30,40,50);

Label labe2 = new Label("Second Label",Label.RIGHT);

String text;
text = l2.getText();
System.out.println(text);
add(11);
add(12);
}
public static void main (String[] args){
new LabelExample();
}
}