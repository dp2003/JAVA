import java.util.*;
import java.awt.event.*;
import java.awt.*;
class Exp14_LoginForm extends JFrame implements ActionListener
{
	String sysname="hello",syspass="hell@123#";
	JLabel name,pass;
	JTextField nametxt;
	JPasswordField passtext;
	JButton submit,reset;
	password()
	{
		super("Password Box");
		setLayout(null);
		name = new JLabel("Username :");
		name.setBounds(50,50,100,30);
		name.setFont(newFont("Monaco",FONT.PLAIN,15));

		pass = new JLabel("Password :");
		pass.setBounds(50,100,100,30);
		pass.setFont(newFont("Monaco",FONT.PLAIN,15));

		nametxt = new JPasswordField;
		nametxt.setBounds(150,100,100,30);

		submit = new JButton();
		submit.setBounds(50,150,80,30);

		reset = new JButton();
	    reset.setBounds(150,150,80,30);

	    add(name);
	    add(pass);
	    add(nametxt);
	    add(passtxt);
	    
	}
}