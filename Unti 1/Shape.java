import java.awt.*;
public class Shape extends Frame{
public Shape (){
this.setTitle ("Rectangle draw");
this.setSize(200,200);
this.setLayout(null);
this.setVisible(true);
}

public void paint(Graphics g){
g.fillRect(20,30,40,50);
g.setColor(Color.red);
}
public static void main(String[] args){
new Shape();
}
}
 