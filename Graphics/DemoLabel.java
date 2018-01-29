import java.awt.*;
import java.applet.*;
import java.awt.Event;
class DemoLabel extends Frame
{
	DemoLabel()
	{
		Label a,b,c;
		a=new Label();
		b=new Label("PQR");
		c=new Label("XYZ",2);
		a.setText("ABC");
		a.setAlignment(0);
		b.setAlignment(1);
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		add(a);add(b);add(c);
		
	}
	public static void main(String args[])
	{
		DemoLabel obj=new DemoLabel();
	}
}