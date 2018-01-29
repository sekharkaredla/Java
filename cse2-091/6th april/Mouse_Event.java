import java.awt.*;
import java.awt.event.*;
class Mouse_Event extends Frame implements MouseListener
{
	Mouse_Event()
	{
	addMouseListener(this);
	setSize(500,500);
	setVisible(true);
	setLayout(new FlowLayout());
	}
	public void mouseEntered(MouseEvent e)
	{
	setBackground(Color.green);
	}
	public void mousePressed(MouseEvent e)
	{
	setBackground(Color.red);
	}
	public void mouseReleased(MouseEvent e)
	{
	setBackground(Color.yellow);
	}
	public void mouseClicked(MouseEvent e)
	{
	setBackground(Color.black);
	}
	public void mouseExited(MouseEvent e)
	{
	setBackground(Color.pink);
	}
	public static void main(String args[])
	{
	Mouse_Event obj=new Mouse_Event();
	}
}
	
	