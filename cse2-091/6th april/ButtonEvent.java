import java.awt.*;
import java.awt.event.*;
class ButtonEvent extends Frame implements ActionListener
{
	Button b;
	ButtonEvent()
	{
	b=new Button("Close");
	b.addActionListener(this);
	add(b);
	setTitle("Button Handling");
	setSize(500,500);
	setVisible(true);
	setLayout(new FlowLayout());
	}
	public static void main(String args[])
	{
	ButtonEvent obj=new ButtonEvent();
	}
	public void actionPerformed(ActionEvent a)
	{
	Button b1=(Button)a.getSource();
	if(b==b1)
	System.exit(0);
	}
}