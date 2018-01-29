import java.awt.*;
import java.applet.*;
import java.awt.event.*;
class Register_page extends Frame implements ActionListener
{
	Label l[];
	Button b1,b2;
	TextField f[];
	Panel p1,p2;
	Register_page()
	{
	l=new Label[8];
	f=new TextField[6];
	setLayout(new FlowLayout());
	l[0]=new Label("Name:");
	l[1]=new Label("Email:");
	l[2]=new Label("Password:");
	l[3]=new Label("Address:");
	l[4]=new Label("Submit:");
	l[5]=new Label("Copy");
	l[6]=new Label("Details:");
	l[7]=new Label("Copy Button:");
	b1=new Button("SUBMIT");
	b2=new Button("COPY");
	f[0]=new TextField("Name",30);
	f[1]=new TextField("Email",30);
	f[2]=new TextField("Password",30);
	f[2].setEchoChar('*');
	f[3]=new TextField("Address",40);
	f[4]=new TextField("Details",40);
	f[5]=new TextField("Copy",40);		
	p1=new Panel();
	p2=new Panel();
	p1.setLayout(new GridLayout(5,2));
	p2.setLayout(new GridLayout(3,2));
	p1.add(l[0]);
	p1.add(f[0]);
	p1.add(l[1]);
	p1.add(f[1]);
	p1.add(l[2]);
	p1.add(f[2]);
	p1.add(l[3]);
	p1.add(f[3]);
	p1.add(l[4]);
	p1.add(b1);
	p2.add(l[6]);
	p2.add(f[4]);
	p2.add(l[5]);
	p2.add(f[5]);
	p2.add(l[7]);
	p2.add(b2);	
	add(p1);
	add(p2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	setSize(400,400);
	setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	Button b=(Button)e.getSource();
	if(b==b1)
	{
	f[4].setText(f[0].getText()+f[1].getText()+f[2].getText()+f[3].getText());
	}
	else if(b==b2)
	{
	f[5].setText(f[4].getText());
	}
	}
	public static void main(String args[])
	{
	Register_page obj=new Register_page();
	}
}