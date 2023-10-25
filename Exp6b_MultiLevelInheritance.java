import java.util.Scanner;
class Employee 
{
	int id;
	String name;
	String city;
	static Scanner sc = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter yor Id, Name and City: ");
		id=sc.nextInt();
		name=sc.next();
		city=sc.next();
	}

	void output()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("City : "+city);


	}
}
class CommissionEmployee extends Employee
{
	final double commission=0.10;
	double g_sales=0;
	double salary=0;

	void in()
	{
		input();
		System.out.println("Enter your Gross sales: ");
		g_sales=sc.nextDouble();
	}
	void comm()
	{
		salary = commission*g_sales;
		System.out.println("Salary: "+salary);
	}
	void out()
	{
		output();
		System.out.println("Your gross sales are :"+g_sales);
		System.out.println("Salary :"+salary);
	}
}
class BasePlusCommissionEmployee extends CommissionEmployee 
{
	double b_sal;
	double com;
	void setter()
	{
		in();
		System.out.println("Enter yur basic salary :");
		b_sal=sc.nextDouble();
	}
	void commission()
	{
		com=commission*g_sales;
		salary=b_sal+com;
		System.out.println("Your total salary is :"+salary);
	}
	void getter()
	{
		output();
		System.out.println("Basic Salary :"+b_sal);
		System.out.println("Gross Salary :"+g_sales);
		System.out.println("Commission :"+com);
		System.out.println("Total Salary :"+salary);

	}
}
class Exp6b_MultiLevelInheritance
{
	public static void main(String args[])
	{
		 CommissionEmployee ob = new CommissionEmployee();

		System.out.println("For Commission Employee :");
		ob.in();
		ob.comm();
		ob.out();

		BasePlusCommissionEmployee ob1 = new BasePlusCommissionEmployee();

		System.out.println("For Base Plus Commission Employee :");
		ob1.setter();
		ob1.commission();
		ob1.getter();

	}
}