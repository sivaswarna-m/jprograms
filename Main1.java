import java.util.Scanner;
 class Evil
{
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r=n*n,rem,sum=0,temp=n;
	void m()
	{
		while(r>0)//81
		{
			rem=r%10;//1 8
			sum=sum+rem;//1 9
			r=r/10;//8 0
		}
		
	}
}
public class Main1
	{
		public static void main(String[] args)
			{
				Evil e=new Evil();
				e.m();
				 int temp=e.temp;
				
				 int sum=e.sum;//9
				if(temp==sum)//9==9
					System.out.println(" Evil");
				else
					System.out.println(" not Evil");

			}
	}
