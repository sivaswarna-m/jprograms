class Armstrong
	{
	   public static void main(String args[])
		{
			int n=16845,rem=0,sum=0,sum2=0,c=0,t=n,pow=0,pow2=0;
			while(n>0)
			{
				c++;
				n=n/10;
			}
			n=t;
			while(n>0)
			{
			  rem=n%10;
			  pow=(int)(Math.pow(rem,c));
			  n=n/10;
		          sum+=pow;
			}
			n=t;
			c=0;
			while(n>0)
			{
			  rem=n%10;
			  c++;
			  pow2=(int)(Math.pow(rem,c));
			  n=n/10;
		          sum2+=pow2;
			}
			n=t;
			
				System.out.println("sum is "+sum);
				System.out.println(sum==n?"Armstrong number":"not an Armstrong number");
				System.out.println("sum is "+sum2);
				System.out.println(sum2==n?"Armstrong number":"not an Armstrong number");

		}
	}


			