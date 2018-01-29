import java.awt.*;
import java.awt.event.*;
class FontChange extends Frame implements ItemListener
{
	Label l1,l2;
	TextField tf1;
	Choice ch;
	Checkbox c1,c2,c3;
	FontChange()
	{
	l1=new Label("Text:");
	l2=new Label("Font family:");
	tf1=new TextField(30);
	ch=new Choice();
	ch.add("TimesNewRoman");
	ch.add("Garamond");
	ch.add("Consolas");
	ch.add("Courier");
	c1=new Checkbox("Bold");
	c2=new Checkbox("Italic");
	c3=new Checkbox("Mixed");
	setSize(500,500);
	setVisible(true);
	setLayout(new FlowLayout());
	setTitle("Font change with options");
	ch.addItemListener(this);
	c1.addItemListener(this);
	c2.addItemListener(this);
	c3.addItemListener(this);
	add(l1);
	add(tf1);
	add(l2);
	add(ch);
	add(c1);
	add(c2);
	add(c3);
	}
	public void itemStateChanged(ItemEvent e)
	{
	String fname;
	int sname=Font.PLAIN;
	//String italic,bold,boldItalic;
	fname=ch.getSelectedItem();
	if(c1.getState()==true)
	sname=Font.BOLD;
	else if(c2.getState()==true)
	sname=Font.ITALIC;
	else if(c3.getState()==true)
	sname=Font.BOLD+Font.ITALIC;
	tf1.setFont(new Font(fname,sname,12));
	}
	public static void main(String args[])
	{
	FontChange obj=new FontChange();
	}
}
