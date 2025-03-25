class Dowhileloop
	{
	   public static void main(String args[])
		{ 
			int n=12345,rem=0,rev=0,temp=n;
			do
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			while(n>0);
				System.out.println(rev);
		}
	}