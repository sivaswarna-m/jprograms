class Power
	{
	   public static void main(String args[])
		{
			int a=10,b=2,s=1,e=b,pow=1;
			while(s<=e)
			{
				pow*=a;
				s++;
			}
				System.out.println(pow);
				System.out.println((int)Math.pow(a,b));
		}
	}