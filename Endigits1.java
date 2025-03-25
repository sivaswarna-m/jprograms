class Endigits1
	{
	   public static void main(String args[])
		{
			int n=223,rem=0,sum=0,pro=1,c=0,t=n,e=0,o=0,max=0,min=n%10;
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
			  if(rem>max)
				max=rem;
			  min=(min<rem?min:rem);
			  if(rem<=min)
				min=(min<rem?min:rem);
			  if(rem%2==0)
			  {
				e++;
				sum+=rem;
			  }
			  else
			  {
				o++;
				pro*=rem;
			  }
			n=n/10;
			}
			while(n>0);
				System.out.println("number of digits "+c);
				System.out.println("number of even digits "+e);
				System.out.println("number of odd digits "+o);
				System.out.println("even digits sum "+sum);
				System.out.println("odd digits product "+pro);
				System.out.println("max number in digit "+max);
				System.out.println("min number in digit "+min);
				System.out.println("product of min number and max number in digit "+(min*max));
				

		}
	}
	