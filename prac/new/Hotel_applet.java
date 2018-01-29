import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class Hotel_applet extends Applet implements ActionListener
{
	public Hotel_applet()
	{}
	List l1,l2,l3;
	Button b[];
	Panel p1,p2,p3;
	CardLayout c;
	public void init()
	{
	c=new CardLayout();
	b=new Button[7];
	b[0]=new Button("First");
	b[1]=new Button("Last");
	b[2]=new Button("Next");
	b[3]=new Button("Previous");
	b[4]=new Button("Hotels");
	b[5]=new Button("Parks");
	b[6]=new Button("Temples");
	p1=new Panel();
	p2=new Panel(c);
	p3=new Panel();
	p1.setLayout(new GridLayout(1,3));
	p3.setLayout(new GridLayout(1,4));
	setLayout(new BorderLayout());
	add(p1,"North");
	add(p3,"South");
	add(p2,"Center");
	p1.add(b[0]);
	p1.add(b[1]);
	p1.add(b[2]);
	p1.add(b[3]);
	p3.add(b[4]);
	p3.add(b[5]);
	p3.add(b[6]);
	l1=new List();
	l1.add("TAJ");
	l2=new List();
	l2.add("BIRLA");
	l3=new List();
	l3.add("LUMBINI");
	p2.add(l1,"HOTELS");
	p2.add(l2,"TEMPLES");
	p2.add(l3,"PARKS");
	setSize(400,400);
	setVisible(true);
	b[0].addActionListener(this);
	b[1].addActionListener(this);
	b[2].addActionListener(this);
	b[3].addActionListener(this);
	b[4].addActionListener(this);
	b[5].addActionListener(this);
	b[6].addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
	Button b1=(Button)e.getSource();
	if(b1==b[0])
	c.first(p2);
	else if(b1==b[1])
	c.last(p2);
	else if(b1==b[2])
	c.next(p2);
	else if(b1==b[3])
	c.previous(p2);
	else if(b1==b[4])
	c.show(p2,"HOTELS");
	else if(b1==b[5])
	c.show(p2,"TEMPLES");
	else
	c.show(p2,"PARKS");
	}
	public void start()
	{System.out.println("STARTED");}
	 public void paint(Graphics g)
    {
        System.out.println("PAINT");
    }
    public void stop()
    {
        System.out.println("STOP");
    }
    public void destroy()
    {
        System.out.println("DESTROY");
    } 
	
}