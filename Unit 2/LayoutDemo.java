import java.awt.*;
public class Layout extends Frame {

        public Layout() {
        this.setTitle("Button");
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        Button b = new Button("hi");
        add(b);
        Button b1 = new Button("hi");
        add(b1);
        Button b2 = new Button("hi"); 
        add(b2);
    }

    public static void main(String[] args) {
        new Layout();
    }
}
