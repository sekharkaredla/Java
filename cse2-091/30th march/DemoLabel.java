import java.awt.*;
import java.applet.*;
class DemoLabel extends Frame
{
	DemoLabel()
	{
	Label l1,l2,l3;
	l1=new Label();
	l2=new Label("Two");
	l1.setText("One");
	l1.setAlignment(0);
	l2.setAlignment(1);
	l3=new Label("Three",2);
	setTitle("JAAVA");
	setVisible(true);
	setSize(500,500);
	setLayout(new FlowLayout());
	add(l1);
	add(l2);
	add(l3);
	}
	public static void main(String args[])
	{
	DemoLabel obj=new DemoLabel();
	}
}