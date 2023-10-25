import java.util.Scanner;
class Person
{
	int id;
	String name;
	String city;
	Scanner in = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter your id name and city");
		id=in.nextInt();
		name=in.next();
		city=in.next();
	}

	void output()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("City: "+city);

	}
}
class Student_data extends Person
{
	Scanner in = new Scanner(System.in);
	int sem;
	int marks[]=new int[5];
	String branch;
	int total=0;

	void setter()
	{
		input();
		System.out.println("Enter yout semester and branch");
		sem= in.nextInt();
		branch=in.next();
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter your marks for Subject "+(i+1));
			marks[i]=in.nextInt();
		}
	}

	void getter()
	{
		output();
		System.out.println("Semester: "+sem);
		System.out.println("Branch: "+branch);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Marks of Subject"+(i+1)+" is "+marks[i]);
		}
	}

	void score()
	{
		for(int i=0;i<marks.length;i++)
		{
			total+=marks[i];
		}
		System.out.println("Your total score is: "+total);
	}

	void average()
	{
		double avg;
		avg=total/marks.length;
		System.out.println("Average is: "+avg);
	}
}
class Exp6a_SingleInheritance
{
	public static void main(String args[])
	{
		Student_data sd=new Student_data();
		sd.setter();
		sd.getter();
		sd.score();
		sd.average();
	}
}
