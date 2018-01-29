import java.awt.*;
import java.applet.*;
import java.awt.Event;
class DemoButton extends Frame
{
	DemoButton()
	{
	Button a,b,c;
	a=new Button("ABC");
	b=new Button("PQR");
	c=new Button("XYZ");
	setVisible(true);
	setSize(400,400);
	setLayout(new FlowLayout());
	add(a);add(b);add(c);
	}
	public static void main(String args[])
	{
	DemoButton obj=new DemoButton();
	}
}