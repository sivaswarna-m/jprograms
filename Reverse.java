class Reverse
	{
	   public static void main(String args[])
		{
			int n=12345,rem=0,rev=0,temp=n;
				System.out.println("given number is "+n);
			while(n>0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
				System.out.println("reverse of a given number is "+rev);
		
			
		}
	}
			