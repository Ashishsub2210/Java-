import java.awt.*;

public class GridLayoutDemo extends Frame{

	GridLayoutDemo(){
		setTitle("Border Layout Example");
		setSize(400,400);
		setLayout(new GridLayout());
		setVisible(true);
		
		Label l1= new Label("North");

		add(l1,BorderLayout.NORTH);
}

public static void main(String arg[]){
new GridLayoutDemo();
}
}
