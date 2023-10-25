class Exp9_Exceptions
{
	public static void main(String args[])
	{
		try
		{
			int a = args.length;
			System.out.println("a= "+a);
			int b=42/9;
			int c[]={1};
			c[42]=99;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by 0");
		}
		catch(ArrayIndexOutOfBoundsException ea)
		{
			System.out.println("Array Index not reached");
		}
	}
}