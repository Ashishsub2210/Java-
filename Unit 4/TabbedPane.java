import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TabbedPane extends JFrame {
    private JCheckBox cb1, cb2, cb3;
    private JRadioButton r, g, b, y, p;
    private JPanel panel1, panel2;
    private JTextArea textArea;

    public TabbedPane() {
        setTitle("JTabbedPane Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cb1 = new JCheckBox("Kathamandu");
        cb2 = new JCheckBox("Chitwan");
        cb3 = new JCheckBox("Hetauda");
        textArea = new JTextArea(10, 20);

        panel1 = new JPanel(new GridLayout(3, 2));
        panel1.add(cb1);
        panel1.add(cb2);
        panel1.add(cb3);
        panel1.add(new JScrollPane(textArea));

        r = new JRadioButton("Red");
        g = new JRadioButton("Blue");
        b = new JRadioButton("Green");
        y = new JRadioButton("Yellow");
        p = new JRadioButton("Purple");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r);
        bg.add(g);
        bg.add(b);
        bg.add(p);
        bg.add(y);

        panel2 = new JPanel(new FlowLayout());
        panel2.add(r);
        panel2.add(g);
        panel2.add(b);
        panel2.add(y);
        panel2.add(p);

        JTabbedPane jtp = new JTabbedPane(JTabbedPane.RIGHT);
        jtp.addTab("Cities", null, panel1, "Tab 1");
        jtp.addTab("Colors", null, panel2, "Tab 2");

        getContentPane().add(jtp);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        textArea.append("Radio button is selected: ");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TabbedPane());
    }
}
