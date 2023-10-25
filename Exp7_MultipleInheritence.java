import java.util.Scanner;
class Persons
{
	static Scanner sc = new Scanner(System.in);
	int id;
	String name,city;

	void put_PersonData()
	{
		System.out.println("Enter Id, Name and City :");
		id=sc.nextInt();
		name=sc.next();
		city=sc.next();
	}

	void get_PersonData()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("City: "+city);

	}
}
class Student extends Persons
{
	String branch;
	int sem;

	void put_StudentData()
	{
		System.out.println("Enter your branch and Semester:");
		branch=sc.next();
		sem=sc.nextInt();
	}
	void get_StudentData()
	{
		System.out.println("Semester: "+sem);
		System.out.println("Branch: "+branch);
	}
}
interface Sports
{
	final int points=25;
}

class Test extends Student implements Sports
{
	int i,n,total,score;
	int marks[];
	char sports_status;

	void put_marks()
	{
		System.out.println("Enter the number of subjects of which you ant to calculate marks:");
		n=Persons.sc.nextInt();
		marks=new int[n];
		System.out.println("Enter marks of "+n+" subjects");
		for(i=0;i<marks.length;i++)
			{
				marks[i]+=sc.nextInt();
			}
	}
	void calculations()
	{
		for(i=0;i<n;i++)
		{
			score=marks[i];
		}
		System.out.println("Total score :"+score);
		System.out.println("Enter 'y' if you have played at national level or else 'n':");
		sports_status=sc.next().charAt(0);
		if(sports_status=='y')
		{
			System.out.println("25 marks would be incremented to your score :");
			total=score+points;
		}
		else
		{
			total=score;
		}
		System.out.println("Final total score = "+total);
	}

	void get_marks()
	{
		get_PersonData();
		get_StudentData();
		for(i=0;i<n;i++)
		{
			System.out.println("Marks of Subjects are "+marks[i]);
		}
		System.out.println("Total Score :"+total);
	}

}
class Exp7_MultipleInheritence
{
	public static void main(String args[])
	{
		Test ob = new Test();
		ob.put_PersonData();
		ob.put_StudentData();
		ob.put_marks();
		ob.calculations();
		ob.get_marks();
	}
}