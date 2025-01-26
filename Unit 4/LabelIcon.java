import java.awt.*;
import javax.swing.*;

public class LabelIcon extends JFrame{


	public LabelIcon(){

		setTitle("Label and Icon");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon img = new ImageIcon(".//java.png");
        JLabel javaLabel = new JLabel("Java Logo",img,JLabel.LEFT);
		JPanel panel = new JPanel();
		//panel.add(img);
		panel.add(javaLabel);
		panel.setLayout(new GridBagLayout());
		//add(panel);
		getContentPane().add(panel);
        setVisible(true);
	}

 public static void main(String arg[]){
 	 SwingUtilities.invokeLater(new Runnable() { // Help for single threads,Improve GUI,Helps to run in background smooyhly 
		  	public void run(){
            new LabelIcon();
       } }); 
 }	
}