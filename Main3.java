import java.util.Scanner;
class Auto
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=n*n;
		int rem=0;
		void cal()
		{

			rem=r%100;
		}
	}
public class Main3
		{
			public static void main(String[] args)
			{

			Auto a=new Auto();
			a.cal();
			int rem=a.rem;
			int n=a.n;
			 
			if(rem==n)
				System.out.println("Automatic number");
			else
				System.out.println(" Not Automatic number");		
			}
		}
	

				