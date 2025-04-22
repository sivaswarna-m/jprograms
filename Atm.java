import java.util.Scanner;
class Atm
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("insert the card");
		Trs t=new Trs();
		t.tstype();
	}
}
class Process
{
	Scanner sc=new Scanner(System.in);

		
	public void actype()
	{
		long balance =156356;


		System.out.println("enter account  type");
		String atype=sc.nextLine();
		if(atype.equals("current"))
		{
			//System.out.println("enter money");
			//int money=sc.nextInt();
			System.out.println("enter the pin number");
			int pin=sc.nextInt();
			if(pin==123)
			{
				System.out.println("pin entered successfully");
				System.out.println("your ereceipt is  your current balance is "+ balance );
			}
			else
			{
				System.out.println("wrong pin");
			}	
		}
		else if(atype.equals("savings"))
		{
			System.out.println("enter money");
			int money=sc.nextInt();
			System.out.println("enter the pin number");
			int pin=sc.nextInt();
			if(pin==123)
			{
				System.out.println("pin entered successfully");
				System.out.println("your ereceipt is  your current balance is "+ balance );
			}
			else
			{
				System.out.println("wrong pin");
			}
		}
	}
}
class Trs extends Process
{
	
	public void tstype()
	{
		System.out.println("enter Transaction type");
		String ttype=sc.nextLine();
		if(ttype.equals("withdraw"))
		{
			System.out.println("enter money");
			int money=sc.nextInt();
			actype();
			long balance =156356;


			if(balance<money)
			{
				System.out.println("insufficient balance");
			}
			else
			{

				System.out.println("your ereceipt is "+money+" transferred successfully your current balance is "+ balance );
			}
				
		}
		else if(ttype.equals("balance enquiry"))
		{
			actype();
		}
		else if(ttype.equals("Atm pin change"))
		{
			System.out.println("enter phone number");
			long num=sc.nextLong();
			if(num<999999999l&&num>9999999999l)
			{
				System.out.println("enter a valid number");
			}
			else
			{
				int otp=sc.nextInt();
				if(otp==14567)
				{
					System.out.println("enter new pin");
					int pinchn=sc.nextInt();
					System.out.println("confirm new pin");
					int pinchn1=sc.nextInt();
					if(pinchn==pinchn1)
					{
						System.out.println("pin changed successfully");
					}
					else
					{
						System.out.println("enter correct pin");
					}
				}
			}
		}
		else if(ttype.equals("mini statement"))
		{
			//System.out.println("enter pin");
			actype();
		}
       	}
}