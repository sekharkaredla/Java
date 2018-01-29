import java.awt.*;
import java.applet.*;
class DemoButton extends Frame
{
	DemoButton()
	{
	Button b1,b2,b3;
	b1=new Button("XYZ");
	b2=new Button("PQR");
	b3=new Button("ABC");
	add(b1);
	add(b2);
	add(b3);
	setSize(400,400);
	setLayout(new FlowLayout());
	setVisible(true);
	}
	public static void main(String args[])
	{	
	DemoButton obj=new DemoButton();
	}
}
	