import java.awt.*;
import java.awt.event.*;
class Demo_Menu extends Frame
{
	MenuBar mb;
	Menu m1,m2;
	MenuItem m[]=new MenuItem[4];
	Demo_Menu()
	{
	mb=new MenuBar();
	setSize(400,400);
	setVisible(true);
	setLayout(new FlowLayout());
	m1=new Menu("FILE");
	m2=new Menu("EDIT");
	m[0]=new MenuItem("Open",new MenuShortcut('A',true));
	m[1]=new MenuItem("Save",new MenuShortcut('S',true));
	m[2]=new MenuItem("edit1",new MenuShortcut('E',true));
	m[3]=new MenuItem("edit2",new MenuShortcut('K',true));
	m1.add(m[0]);
	m1.add(m[1]);
	m2.add(m[2]);
	m2.add(m[3]);
	mb.add(m1);
	mb.add(m2);
	setMenuBar(mb);
	}
	public static void main(String args[])
	{
	Demo_Menu o=new Demo_Menu();
	}
}	