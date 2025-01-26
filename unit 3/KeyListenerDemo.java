import java.awt.*;
import java.awt.event.*;

public class KeyListenerDemo extends Frame {
	KeyListenerDemo() {
        setTitle("KeyListener");
        setSize(200, 200);
        setLayout(new FlowLayout());

        TextField f1 = new TextField();
        add(f1);

        f1.addKeyListener(new KeyListener() {
        public void keyPressed(KeyEvent ke) {
        System.out.println("Key Pressed: " + ke.getKeyChar());
}
            public void keyReleased(KeyEvent ke) {
            }
          
            public void keyTyped(KeyEvent ke) {
}
});

setVisible(true);
}
    public static void main(String[] args) {
    new KeyListenerDemo();
}
}
