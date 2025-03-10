class Evenhalf
	{
	   public static void main(String args[])
		{
			int n=168466,sum=0,erem1=0,erem2=0,esum1=0,c=0,t=n,d=0,f=0,s=0,esum2=0,orem=0,osum=0;
			while(n>0)
			{
				c++;
				n=n/10;
			}
			n=t;
			    if(c%2==0)
			    {
				  d=(int)(Math.pow(10,c/2));
				  f=n%d;
				  s=n/d;
				  while(f>0)
				  {
					erem1=f%10;
					f=f/10;
					esum1+=erem1;
			          }
					System.out.println("first half of even sum is "+esum1);
				  while(s>0)
				  {
					erem2=s%10;
					s=s/10;
					esum2+=erem2;
	               		  }
					System.out.println("second half of even sum is "+esum2);
					sum=esum1+esum2;
			    }
			    else
			    {
				    f=n%10;
				    s=n/10;
				    while(s>0)
			 	    {
					orem=s%10;
					s=s/10;
					osum+=orem;
				    }
					System.out.println("odd last digit "+f);
					System.out.println("odd remaining digits sum "+osum);

					sum=osum+f;
			    }
				System.out.println("sum "+sum);
		}
	}
				
