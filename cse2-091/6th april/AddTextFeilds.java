import java.awt.*;
import java.awt.event.*;
class AddTextFeilds extends Frame implements TextListener
{
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	TextArea t;
	AddTextFeilds()
	{
	l1=new Label("NAME:");
	l2=new Label("PASSWORD:");
	l3=new Label("EMAIL:");
	tf1=new TextField(30);
	tf2=new TextField(30);
	tf3=new TextField(30);
	tf2.setEchoChar('*');
	t=new TextArea(30,30);
	t.setEditable(false);
	add(l1);
	add(tf1);
	add(l2);
	add(tf2);
	add(l3);
	add(tf3);
	add(t);
	setTitle("Text Testing");
	setSize(350,350);
	setVisible(true);
	setLayout(new FlowLayout());
	tf1.addTextListener(this);
	tf2.addTextListener(this);
	}
	public static void main(String args[])
	{
	AddTextFeilds obj=new AddTextFeilds();
	}
	public void textValueChanged(TextEvent e)
	{
	t.setText(tf1.getText()+tf2.getText()+tf3.getText());
	}
}