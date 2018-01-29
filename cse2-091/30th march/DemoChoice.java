import java.awt.*;
import java.applet.*;
class DemoChoice extends Frame
{
	DemoChoice()
	{
	Label l1=new Label("Color:",0);
	Label l2=new Label("Item:",0);
	Label l3=new Label("Price:",0);
	Choice c=new Choice();
	c.add("Blue");
	c.add("Green");
	c.add("Yellow");
	c.add("Black");
	c.add("Red");
	c.add("Pink");
	c.add("Violet");
	c.add("Brown");
	c.add("Indigo");
	c.add("White");
	c.select("Black");
	List l=new List();
	l.add("Pant");
	l.add("Shirt");
	l.add("Jeans");
	l.add("Formal pant");
	l.add("T shirt");
	l.add("Dress");
	l.add("Half kurta");
	l.add("Pathan suit");
	l.add("Sports wear");
	l.add("Traditional");	
	l.setMultipleMode(true);
	List cost=new List();
	cost.add("100");
	cost.add("500");
	cost.add("859");
	cost.add("2000");
	cost.add("2499");
	cost.add("3699");
	cost.add("10000");
	cost.add("5000");
	cost.add("9999");
	//l.setMultipleMode(false);
	add(l1);
	add(c);
	add(l2);
	add(l);
	add(l3);
	add(cost);
	setVisible(true);
	setLayout(new FlowLayout());
	setSize(500,500);
	setTitle("Choice List");
	}
	public static void main(String args[])
	{
	DemoChoice obj=new DemoChoice();
	}
}