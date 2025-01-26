import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckRadio extends JFrame implements ItemListener{

	private JCheckBox cb1,cb2,cb3;
	private JLabel txt,txt2;
	private JPanel panel;
	private JRadioButton male,female;

	public CheckRadio(){

		setTitle("Radio Button and CheckBox Example");
		setSize(300,200);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cb1  = new JCheckBox("Python");
		cb2  = new JCheckBox("C++");
		cb3  = new JCheckBox("Java");

		male = new JRadioButton("Male");
		female = new JRadioButton("Female");

		ButtonGroup bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);

		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);

		male.addItemListener(this);
		female.addItemListener(this);

		txt = new JLabel("Select Your Language");
		txt2 = new JLabel("Select Your Gender");

		panel = new JPanel();

		panel.setLayout(new FlowLayout());
		panel.add(cb1);
		panel.add(cb2);
		panel.add(cb3);
		panel.add(txt);

		panel.add(male);
		panel.add(female);
		panel.add(txt2);

		getContentPane().add(panel);
		setVisible(true);

	}
	public void itemStateChanged(ItemEvent e){
		if(e.getStateChange() == ItemEvent.SELECTED){
			if(e.getItem() instanceof JCheckBox){
				JCheckBox checkbox = (JCheckBox)e.getItem();
				if(checkbox == cb1){
					txt.setText("Python selected");
				}else if(checkbox == cb2){
					txt.setText("C++ selected");
				}else if(checkbox == cb3){
					txt.setText("Java selected");
				}
			}else if(e.getItem() instanceof JRadioButton){
				JRadioButton radio = (JRadioButton)e.getItem();
				if(radio == male){
					txt2.setText("Male selected");
				}else if(radio == female){
					txt2.setText("Female selected");
				}
			}
		}
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		  	public void run(){
            new CheckRadio();
       } });
	}
}

