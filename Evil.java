import java.util.Scanner;
 class Evil1
{
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r=n*n,rem,sum=0,temp=n;
	int method()
	{
		temp=n;
		while(r>0)//81
		{
			rem=r%10;//1 8
			sum=sum+rem;//1 9
			r=r/10;//8 0
		}
		return sum;

	}
	
}
public class Evil
	{
		public static void main(String[] args)
			{
				Evil1 e=new Evil1();
				e.method();
				int temp=e.sum;
				int sum=e.sum;
				if(temp==sum)//9==9
					System.out.println(" Evil");
				else
					System.out.println(" not Evil");

			}
	}
