class Evenoddsum
	{
	   public static void main(String args[])
		{
			int n=1684,sum=0,count=0,t=n,d=0,firsthalf=0,secondhalf=0;
			while(n>0)
			{
				count++;
				n=n/10;
			}
			n=t;
			    if(count%2==0)
			    {
				  d=(int)(Math.pow(10,count/2));
				  firsthalf=n%d;
				  secondhalf=n/d;
					System.out.println("first half of even digit is "+firsthalf);
					System.out.println("second half of even digit is "+secondhalf);

					sum=firsthalf+secondhalf;
			    }
			    else
			    {
				    firsthalf=n%10;
				    secondhalf=n/10;
					System.out.println("odd last digit "+firsthalf);
					System.out.println("odd remaining digits sum "+secondhalf);

					sum=secondhalf+firsthalf;
			    }
				System.out.println("sum of the digits "+sum);
		}
	}
				
