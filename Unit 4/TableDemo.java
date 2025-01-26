import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TableDemo extends JFrame{

	public TableDemo(){
		setTitle("Table");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String[] colHeads = {"FirstName","LastName"};

		Object[][] data ={ {"Cva" ,"PTK"},{"Ram","Kumar"},{"Sam","Martin"},{"",""}};

		JTable table = new JTable(data,colHeads);

		JScrollPane jsp = new JScrollPane(table);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		panel.add(jsp);
		getContentPane().add(panel);
		pack();
		setVisible(true);
 	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		  	public void run(){
            new TableDemo();
       } });
	}
}