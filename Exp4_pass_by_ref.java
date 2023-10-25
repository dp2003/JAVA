class PassByRef
{
	int a,b;

	PassByRef(int i,int j)
	{
		a=i;
		b=j;
	}

	void changeOB(PassByRef o)
	{
		System.out.println("Values of o = "+o);
		o.a*=2;
		o.b/=2;
	}
}
class Exp4_pass_by_ref
{
	public static void main(String args[])
	{
		PassByRef ob1= new PassByRef(15,20);
		PassByRef ob2= new PassByRef(10,12);

		System.out.println("ob2.a and ob2.b befoe call: "+ob2.a+ob2.b);
		System.out.println("Value of ob2 = "+ob2);

		ob1.changeOB(ob2);
		System.out.println("ob2.a and ob2.b after call: "+ob2.a+" "+ob2.b);
	}
}