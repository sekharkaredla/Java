import java.awt.*;
import java.applet.*;
import java.awt.Event;
import java.awt.Image;
class DemoText extends Frame
{
	Label l1,l2,l3;
	TextField f1,f2,f3;
	TextArea t;
	DemoText()
	{
	l1=new Label("Email:");
	l2=new Label("Name:");
	l3=new Label("Pass:");
	l1.setAlignment(0);
	l2.setAlignment(0);
	l3.setAlignment(0);	
	f1=new TextField("Enter email",30);
	f2=new TextField("Enter name",30);
	f3=new TextField("Enter Password",30);
	f3.setEchoChar('*');
	t=new TextArea("press enter to see all details",20,20);
	t.setEditable(false);
	add(l1);
	add(f1);
	add(l2);
	add(f2);
	add(l3);
	add(f3);
	//System.out.println();
	add(t);
	setSize(350,400);
	setLayout(new FlowLayout());
	setVisible(true);
	}
	public static void main(String args[])
	{
	DemoText obj=new DemoText();
	}
}
	