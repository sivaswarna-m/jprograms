import java.util.Scanner;
class Ivan
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,sum=0,sum1=0,rem1=0;
		void i()
		{
		while(n>0)//199
			{
				rem=n%10;//9 9 1
				sum=sum+rem;//9 18 19
				n=n/10;//19 1 0
			}
			if(sum/10==0)//19/10
			{
				sum=sum;
			}
			else
			{
			 while(sum/10!=0)//10
			{
				while(sum>0)//19 1 10
				{
				rem1=sum%10;//9 1 1   0
				sum1=sum1+rem1;//9 10 
				sum=sum/10;//1
				
				if(sum1/10==0)//10
					break;
				else 
					sum=sum1;//10
				}

			}

		       }
		}
	}
public class Main4
		{
			public static void main(String[]args)
			{
			Ivan w=new Ivan();
			w.i();
			int sum=w.sum;
			int sum1=w.sum1;
			if(sum==1 || sum1==1)
				System.out.println("Ivan");
			else
				System.out.println("not Ivan");
		        }
		}