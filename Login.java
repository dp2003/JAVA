import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class LoginFrame extends JFrame implements ActionListener
{
	String uname="Durva";
	String pass = "1234";

	JLabel ulabel;
	JLabel plabel;
	JTextField userText= new JTextField();
	JPasswordField passField = new JPasswordField();

	JButton logBtn;
	JButton resetBtn;

	LoginFrame()
	{
		setLayout(new GridLayout(3,2,6,6));
		ulabel = new JLabel("Username :");
		add(ulabel);
		add(userText);
		plabel= new JLabel("Password :");
		add(plabel);
		add(passField);
		logBtn= new JButton("Login");
		add(logBtn);
		resetBtn = new JButton("Reset");
		add(resetBtn);
		logBtn.addActionListener(this);
		resetBtn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		JButton btn = (JButton) ae.getSource();
		if(btn== logBtn)
		{
			if(userText.getText().equals(uname)&& passField.getText().equals(pass))
			{
				JOptionPane.showMessageDialog(this,"Login Successful");
			}
			else if(userText.getText().equals("")&& passField.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"Please enter Username and Password","Validation Error",JOptionPane.ERROR_MESSAGE);
			}
			else if(userText.getText().equals("")&& passField.getText().equals(pass))
			{
				JOptionPane.showMessageDialog(this,"Please enter your Username","Warning",JOptionPane.WARNING_MESSAGE);
			}
			else if(userText.getText().equals(uname)&& passField.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"Please enter your Password","Warning",JOptionPane.WARNING_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Ivalid Input","Warning",JOptionPane.WARNING_MESSAGE);
			}
		}
		if (btn== resetBtn)
		{
			userText.setText(" ");
			passField.setText(" ");
		}
	}
}
class Login
{
	public static void main(String args[])
	{
		LoginFrame log = new LoginFrame();
		log.setTitle("Login");
		log.setVisible(true);
		log.setBounds(50,10,500,300);
		log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
	}
}