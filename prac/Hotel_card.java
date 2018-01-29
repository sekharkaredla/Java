import java.awt.*;
import java.awt.event.*;
class Hotel_card extends Frame implements ActionListener
{
	Button b[];
	CardLayout c=new CardLayout();
	List tl,pl,hl;
	Panel p1,p2,p3;
	Hotel_card()
	{
	b=new Button[7];
	p1=new Panel();
	p3=new Panel();
	p2=new Panel(c);
	b[0]=new Button("Hotels");
	b[1]=new Button("Temples");
	b[2]=new Button("Parks");
	b[3]=new Button("First");
	b[4]=new Button("Last");
	b[5]=new Button("Next");
	b[6]=new Button("Previous");
	tl=new List();
	pl=new List();
	hl=new List();
	tl.add("BIRLA MANDIR");
	tl.add("CHILKUR");
	hl.add("PARK HYATT");
	hl.add("TAJ KRISHNA");
	pl.add("NTR GARDENS");
	pl.add("LUMBINI");
	p2.add(tl,"TEMPLES");
	p2.add(hl,"HOTELS");
	p2.add(pl,"PARKS");
	p1.setLayout(new GridLayout(1,3));
	p1.add(b[0]);
	p1.add(b[1]);
	p1.add(b[2]);
	setLayout(new BorderLayout());
	p3.setLayout(new GridLayout(1,4));
	p3.add(b[3]);
	p3.add(b[4]);
	p3.add(b[5]);
	p3.add(b[6]);
	add(p1,"North");
	add(p3,"South");
	add(p2,"Center");
	b[0].addActionListener(this);
	b[1].addActionListener(this);
	b[2].addActionListener(this);
	b[3].addActionListener(this);
	b[4].addActionListener(this);
	b[5].addActionListener(this);
	b[6].addActionListener(this);
	setVisible(true);
	setSize(400,400);
	}
	public void actionPerformed(ActionEvent e)
	{
	String s=e.getActionCommand();
	if(s.equals("Next"))
	c.next(p2);
	else if(s.equals("Last"))
	c.last(p2);
	else if(s.equals("First"))
	c.first(p2);
	else if(s.equals("Previous"))
	c.previous(p2);
	else if(s.equals("Hotels"))
	c.show(p2,"HOTELS");
	else if(s.equals("Temples"))
	c.show(p2,"TEMPLES");
	else
	c.show(p2,"PARKS");
	}
	public static void main(String args[])
	{
	Hotel_card obj=new Hotel_card();
	}
}