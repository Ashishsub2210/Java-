import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <applet code="LifeCycleofApplets.class" width="300" height="200"></applet>*/ 
public class LifeCycleofApplets extends Applet {
	String name,age,college;
	public void init(){
		System.out.println("Init is Initialised");
		name=getParameter("firstName")+" "+getParameter("lastName");
		age=getParameter("age");
		college=getParameter("college");

		}

	public void start(){
		System.out.println("Start is Initialised");
		System.out.println("The name is "+name+" age is "+age+" college is "+college);
	}

	public void paint(Graphics g){
        System.out.println("Paint is Initialised");
        g.drawString("The name is "+name+" age is "+age+" college is "+college, 50, 60);
	}

	public void stop(){
		System.out.println("Stop is Initialised");		
	}

	public void destroy(){
		System.out.println("Destroy is Initialised");
	}

}