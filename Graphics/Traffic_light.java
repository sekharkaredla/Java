import java.awt.*;
import java.awt.event.*;
class Traffic_Light extends Frame implements ActionListener
{
Button b1,b2,b3;
Traffic_Light()
{
b1=new Button("Red");
b2=new Button("Yellow");
b3=new Button("Green");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
add(b1);
add(b2);
add(b3);
setSize(3000,3000);
setVisible(true);
setLayout(new FlowLayout());
}
public void paint(Graphics gr)
{
gr.drawRect(200,200,100,400);
gr.drawOval(200,200,100,100);
gr.drawOval(200,320,100,100);
gr.drawOval(200,440,100,100);
}
public static void main(String args[])
{
Traffic_Light td=new Traffic_Light();
}
public void actionPerformed(ActionEvent ae)
{
String b;
b=ae.getActionCommand();
//repaint();
Graphics gr=getGraphics();
if(b.equals("Red"))
{
gr.setColor(Color.RED);
gr.fillOval(200,200,100,100);
}
if(b.equals("Yellow"))
{
gr.setColor(Color.YELLOW);
gr.fillOval(200,320,100,100);
}
if(b.equals("Green"))
{
gr.setColor(Color.GREEN);
gr.fillOval(200,440,100,100);
}
}
}
