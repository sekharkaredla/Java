import java.awt.*;
import java.awt.event.*;
class Scrollbar_color extends Frame implements AdjustmentListener
{
	Label l1,l2,l3;
	Scrollbar s1,s2,s3;
	Panel p1,p2;
	Scrollbar_color()
	{
	l1=new Label("RED:");
	l2=new Label("GREEN:");
	l3=new Label("BLUE:");
	s1=new Scrollbar(0,0,1,0,255);
	s2=new Scrollbar(0,0,1,0,255);
	s3=new Scrollbar(0,0,1,0,255);
	p1=new Panel();
	p2=new Panel();
	p2.setLayout(new GridLayout(3,2));
	p2.add(l1);
	p2.add(s1);
	p2.add(l2);
	p2.add(s2);
	p2.add(l3);
	p2.add(s3);
	setLayout(new BorderLayout());
	add(p1,"Center");
	add(p2,"South");
	setSize(400,400);
	setVisible(true);
	s1.addAdjustmentListener(this);
	s2.addAdjustmentListener(this);
	s3.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
	p1.setBackground(new Color(s1.getValue(),s2.getValue(),s3.getValue()));
	}
	public static void main(String args[])
	{
	Scrollbar_color obj=new Scrollbar_color();
	}
}