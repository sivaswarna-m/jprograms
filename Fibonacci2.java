class Fibonacci2
	{
	   public static void main(String args[])
		{
			int n=1,a=0,b=1,c=0;
			do
			{
				c=a+b;
				System.out.println(a);
				a=b;
				b=c;
				
				n++;
			}
			while(n<=15);
						}
	}