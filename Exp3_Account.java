import java.util.Scanner;
class Account{
	
		Scanner sc = new Scanner(System.in);
		int acc_no;
		String name;
		float balance,amount,withdraw;

		Account(){}

		Account(int acc_no,String name,float balance)
		{
			this.acc_no = acc_no;
			this.name =name;
			this.balance = balance;
		}

		void setter()
		{
			System.out.println("Enter account number,name and balance");
			acc_no=sc.nextInt();
			name=sc.next();
			balance=sc.nextFloat();
		}
		void getter()
		{
			System.out.println("Account Number ="+acc_no);
			System.out.println("Name ="+name);
			System.out.println("Amount that has been deposit ="+amount);
			System.out.println("New blance aferadding depositv="+balance);
			System.out.println("Amount that has been withdrawn ="+withdraw);
			if(balance-withdraw>500)
			{
				System.out.println("New Balance after withdraw = "+(balance-withdraw));

			}
			else 
			{
				System.out.println("You cannot withdrawn the amount as you hve balance less than Rs.500");
				System.out.println("-------------------------------------------------------------------");
			}
			System.out.println(" ");
}
void credit()
{
	System.out.println("Enter the amunt to deposit:");
	amount=sc.nextFloat();
	balance=balance+amount;
}
void debit()
{
	System.out.println("Enter the amount to withdraw :");
	withdraw=sc.nextFloat();
}
}

class Exp3_Account
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,a=1,b=1;
		System.out.println("How many persons details you want :");
		n=sc.nextInt();
		Account ac[]=new Account[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Pesons :"+ a++);
			ac[i]= new Account();
			ac[i].setter();
			ac[i].credit();
			ac[i].debit();

		}
		for(i=0;i<n;i++)
		{
			System.out.println("Person ="+ b++);
			ac[i].getter();
		}
		System.out.println(" ");

	}

}
