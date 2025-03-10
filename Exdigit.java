class Exdigit
	{
	   public static void main(String args[])
		{
		   int n=1456,rem=0,sum=0;
		   while(n>0)
		   {
			rem=n%10;
			System.out.println(rem);
			n=n/10;
			sum+=rem;
		   }
			System.out.println("sum of digits is "+sum);
		}
	}
