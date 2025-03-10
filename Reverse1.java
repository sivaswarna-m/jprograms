class Reverse1
	{
	   public static void main(String args[])
		{
			int n=12000,rev=0,rem=0,count1=0,count2=0,t=n,rem1=0,rev2=0,a=0;
			while(n>0)
			{
			  count1++;
			  n=n/10;
			}
			n=t;
			while(n>0)
			{
			    rem=n%10;
			    rev=rev*10+rem;
			    n=n/10;
			}
				System.out.println(rev);
			a=rev;
			while(rev>0)
			{
				count2++;
				rev=rev/10;
			}
		        rev=a;
			while(rev>0)
			{
				rem1=rev%10;
				rev2=rev2*10+rem1;
				rev=rev/10;
			}
			int c=count1-count2;
			while(c>0)
			{
				rev2=rev2*10;
				c--;
			}
				System.out.println(rev2);

		}
	}