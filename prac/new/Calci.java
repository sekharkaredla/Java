import java.awt.*;
import java.awt.event.*;
class Calci extends Frame implements ActionListener
{
	GridBagLayout gb=new GridBagLayout();
	GridBagConstraints c=new GridBagConstraints();
	Panel p;
	TextField f;
	Calci()
	{
	p=new Panel();
	f=new TextField(30);
	f.setBackground(Color.BLUE);
	p.setBackground(Color.RED);
	c.insets=new Insets(2,2,2,2);
	c.weightx=1;
	c.weighty=1;
	c.fill=GridBagConstraints.BOTH;
	p.setLayout(gb);
	setLayout(new BorderLayout());
	add(f,"North");
	add(p,"Center");
	addButton(0,0,1,1,new Button("7"));
	addButton(0,1,1,1,new Button("8"));
	addButton(0,2,1,1,new Button("9"));
	addButton(0,3,1,1,new Button("-"));
	addButton(0,4,1,1,new Button("*"));
	addButton(1,0,1,1,new Button("4"));
	addButton(1,1,1,1,new Button("5"));
	addButton(1,2,1,1,new Button("6"));
	addButton(1,3,3,1,new Button("+"));
	addButton(1,4,1,1,new Button("/"));
	addButton(2,0,1,1,new Button("1"));
	addButton(2,1,1,1,new Button("2"));
	addButton(2,2,1,1,new Button("3"));
	addButton(2,4,1,1,new Button("%"));
	addButton(3,0,1,2,new Button("0"));
	addButton(3,2,1,1,new Button("."));
	addButton(3,4,1,1,new Button("="));
	setVisible(true);
	setSize(300,400);
	}
	void addButton(int c1,int r,int h,int w,Button b)
	{
	c.gridx=r;
	c.gridy=c1;
	c.gridheight=h;
	c.gridwidth=w;
	gb.setConstraints(b,c);
	p.add(b);
	b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
	f.setText(e.getActionCommand());
	}
	public static void main(String args[])
	{
	Calci o=new Calci();
	}
}