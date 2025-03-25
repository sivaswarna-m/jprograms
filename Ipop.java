class Ipop
	{
	   public static void main(String args[])
		{
			int n=12345,c=0,rem=0,rev=0,sum=0,t=n,a=0,rem1=0,p=0,r=0,sum2=0;
			while(n>0)
			{
			   rem=n%10;
			   rev=rev*10+rem;
			   n=n/10;
			   sum+=rem;
			   c++;
			}
			    
			n=t;
			while(rev>0)
			{
			   rem1=rev%10;
			   c--;
			   a=sum/rem1;
			   p=(int)(Math.pow(10,c));
			   r=a*p;

			   sum2=sum2+r;
			   rev=rev/10;
			   
			}
				System.out.println(sum2);
		}
	}    		    