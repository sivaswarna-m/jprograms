import java.util.Scanner;
class Power1
	{       int n,rem=0,sum=0,pro=1;
		void m()
		{
			while(n>0)
			{
				rem=n%10;
				sum+=rem;
				pro*=rem;
				n=n/10;
			}
		}
	}
 public class Main2
	{
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				Power1 p=new Power1();
				p.m();
				int s=p.sum;
				int pr=p.pro;
				if(s==pr)
					System.out.println("power number");

				else
					System.out.println(" not power number");

			}
	}