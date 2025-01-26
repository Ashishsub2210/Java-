import java.applet.Applet;
import java.awt.*;

public class ButtonDemo extends Applet {

    Checkbox c1 = new Checkbox("Java");
    Checkbox c2 = new Checkbox("Hello");
    Checkbox c3 = new Checkbox("CSS");

    Button b1 = new Button("Submit");
    Button b2 = new Button("Reset");

    public void init() {
	setLayout(new GridLayout(2, 3));
        add(c1);
        add(c2);
        add(c3);
        
	add(b1);
        add(b2);
	setLayout(new FlowLayout());
}
}
