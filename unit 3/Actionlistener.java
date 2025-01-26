import java.awt.*;
import java.awt.event.*;

	public class EventExample extends Frame implements ActionListner{
	ExampleEvent(){
	setsize(200,200);
	setTitle("Event");
	setLayout(new Flowlayout());
	Button b1= new Button("Click Me!");
	
	Label l1 = new label();
	add(l1);
	add(b1);
