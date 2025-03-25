class Armstrong4
	{
	   public static void main(String args[])
		{
			int n=16845,rem=0,sum=0,sum2=0,c=0,t=n,pow=0,pow2=0;
			do
			{
				c++;
				n=n/10;
			}
			while(n>0);
			n=t;
			do
			{
			  rem=n%10;
			  pow=(int)(Math.pow(rem,c));
			  n=n/10;
		          sum+=pow;
			}
			while(n>0);
			n=t;
			c=0;
			do
			{
			  rem=n%10;
			  c++;
			  pow2=(int)(Math.pow(rem,c));
			  n=n/10;
		          sum2+=pow2;
			}
			while(n>0);
			n=t;
			
				System.out.println("sum is "+sum);
				System.out.println(sum==n?"Armstrong number":"not an Armstrong number");
				System.out.println("sum is "+sum2);
				System.out.println(sum2==n?"Armstrong number":"not an Armstrong number");

		}
	}
