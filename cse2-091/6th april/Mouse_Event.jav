import java.awt.*;
import java.awt.event.*;
class MouseEvent extends Frame implements MouseListener
{
	MouseEvent()
	{
	addMouseListener(this);
	}
	public void MouseEntered(MouseEvent e)
	{
	setBackground(Color.green);
	}
	public void MousePressed(MouseEvent e)
	{
	setBackground(Color.red);
	}
	public void MouseReleased(MouseEvent e)
	{
	setBackground(Color.yellow);
	}
	public void MouseClicked(MouseEvent e)
	{
	setBackground(Color.black);
	}
	}
	public static void main(String args[])
	{
	MouseEv
	
	