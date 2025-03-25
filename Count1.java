class Count1
	{
	   public static void main(String args[])
		{
			int n=7654,c=0;
			do
			{
				c++;
				n=n/10;
			}
			while(n>0);
			System.out.println(c);
		}
	}
