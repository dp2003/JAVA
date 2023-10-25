import java.awt.*;
import java.awt.event.*;
public class Frame1 extends Frame implements ActionListener
{
TextField tf1, tf2;
Button submit;
public Frame1()
{
	setLayout(new GridLayout(6, 2, 25, 25));
	setBackground(Color.cyan);
tf1 = new TextField(10);
tf2 = new TextField(10);

submit = new Button("Submit"); 
submit.addActionListener(this);
add(new Label("Enter Grade"));
add(tf1);
add(new Label("Enter Salary"));
add(tf2);
setTitle("Arithmetic");
setSize(400,450);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{

}
public static void main(String[] args)
{
new Frame1();
}
}