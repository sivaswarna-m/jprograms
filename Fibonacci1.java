class Fibonacci1
	{
	   public static void main(String args[])
		{
			int a=0,b=1,n=17;
			for(int i=1;i<=n;i++)
			{
				int c=a+b;
				    a=b;
				    b=c;

				
			}
				System.out.println("17th number of fibonacci series "+a);
						
		}
	}