import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ItemListener;

public class ToogleBtn extends JFrame implements ItemListener{

	private JToggleButton jtbn;
	private JLabel res,txt;
	private JPanel panel;
	private JRadioButton radioButton;

	public ToogleBtn(){
        setTitle("Toogle Button");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		res = new JLabel();
		jtbn = new JToggleButton("On/OFF");
		jtbn.addItemListener(this);

		radioButton = new JRadioButton("Check me");
		radioButton.addItemListener(this);

		panel = new JPanel();
		panel.setLayout(new FlowLayout());

		panel.add(jtbn);
		panel.add(radioButton);
		panel.add(res);
		
		getContentPane().add(panel);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e){
		if(jtbn.isSelected()){
			panel.setBackground(Color.BLACK);
			res.setText("Welcome to Dark Mode");
			res.setForeground(Color.white);
		}else{
			panel.setBackground(Color.WHITE);
			res.setText("Welcome to Normal Mode");
			res.setForeground(Color.black);
		}
		
		if(radioButton.isSelected()){
			System.out.println("Radio button is selected");
		}else{
			System.out.println("Radio button is not selected");
		}
		repaint();
	}
	 public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		  	public void run(){
            new ToogleBtn();
       } });
	}
}