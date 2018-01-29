import java.awt.*;
import java.awt.event.*;
class ColorButton extends Frame implements ActionListener
{
	Button red,green,blue;
	ColorButton()
	{
	red=new Button("RED");
	green=new Button("GREEN");
	blue=new Button("BLUE");
	setVisible(true);
	setSize(400,400);
	setTitle("Color with Buttons");
	setLayout(new FlowLayout());
	red.addActionListener(this);
	green.addActionListener(this);
	blue.addActionListener(this);
	add(red);
	add(green);
	add(blue);
	}
	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==red)
	setBackground(Color.red);
	else if(e.getActionCommand().equals("GREEN"))
	setBackground(Color.green);
	else
	setBackground(Color.blue);
	}
	public static void main(String args[])
	{
	ColorButton obj=new ColorButton();
	}
}