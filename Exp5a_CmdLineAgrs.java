import java.util.Scanner;
class Exp5a_CmdLineAgrs
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a=Integer.parseInt(args[0]);
		System.out.println("Number one:"+a);
		b=Integer.parseInt(args[1]);
		System.out.println("Number two:"+b);
		c=a+b;
		System.out.println("Addition of two numbers is: "+c);
	}
}