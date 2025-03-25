import java.util.Scanner;
public class Twin_prime 
{
   public static void main(String[] args) 
   {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Prime p=new Prime();
		String result=p.checkprime(0);
		String result1=p.checktwinprime(0);
		System.out.println(result);
		System.out.println(result1);
		
    }

}
class Prime
{
	 public static void main(String[] args) 
		{
	void  model(int n,int c,int s)
	{
		while(s>=n)
		{
		 if(n%s==0)
		 {
			c++;
			s++;
		 }
		}
	}
	String checkprime(int c)
	{
		if(c==2)
		
			return "prime";
		else
			return "not prime";
	}
	void model2(int x,int n,int c1,int e)
	{
		x=n+2;
		while(x>0)
		{
			if(x%e==0)
			{
				c1++;
				e++;
			}
		}
	}
	String checktwinprime(int c1)
	{
		if(c1==2)
			return "twin prime";
		else
			return "not twin prime";
	}
		}
}
