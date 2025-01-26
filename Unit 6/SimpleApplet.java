import java.applet.Applet;
import java.awt.*;
import javax.swing.JFrame;

public class SimpleApplet extends Applet {

    public void init() {
        setBackground(Color.yellow);
    }

    public void paint(Graphics g) {
        g.drawString("My First Applet", 50, 60);
    }
 
    public static void main(String[] args) {
        SimpleApplet applet = new SimpleApplet();
        applet.init();

        JFrame frame = new JFrame("Simple Applet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(applet);
        frame.setVisible(true);
    }
}