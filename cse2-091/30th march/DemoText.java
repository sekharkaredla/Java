import java.awt.*;
import java.applet.*;
class DemoText extends Frame
{
	Label l1,l2,l3;
	TextField f1,f2,f3;
	TextArea t;
	DemoText()
	{
	l1=new Label("NAME:");
	l2=new Label("PASSWORD:");
	l3=new Label("EMAIL:");
	f1=new TextField("Enter Name",30);
	f2=new TextField("Enter Password",30);
	f3=new TextField("Enter Email",30);
	f2.setEchoChar('*');
	t=new TextArea("Press return to get the input",30,30);
	t.setEditable(false);
	add(l1);
	add(f1);
	add(l2);
	add(f2);
	add(l3);
	add(f3);
	add(t);
	setTitle("Text Testing");
	setSize(350,350);
	setVisible(true);
	setLayout(new FlowLayout());
	}
	public static void main(String args[])
	{
	DemoText obj=new DemoText();
	}
}