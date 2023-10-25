import java.util.Scanner;
class Exp5bScannerClass
{
	public static void main(String args[])
	{
		int qty;
		float price;
		String title,author;

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the Book Title,Author,Price and Quantity :");
		title=sc.next();
		author=sc.next();
		price=sc.nextFloat();
		qty=sc.nextInt();
		System.out.println("Title :"+title);
		System.out.println("Author :"+author);
		System.out.println("Price :"+price);
		System.out.println("Quantity :"+qty);
		
	}
}