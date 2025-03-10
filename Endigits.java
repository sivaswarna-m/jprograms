class Endigits
	{
	   public static void main(String args[])
		{
			int n=222,rem=0,sum=0,pro=1,c=0,t=n,e=0,o=0,max=0,min=1;
			while(n>0)
			{
				c++;
				n=n/10;
			}
			n=t;
			while(n>0)
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
				System.out.println("number of digits "+c);
				System.out.println("number of even digits "+e);
				System.out.println("number of odd digits "+o);
				System.out.println("even digits sum "+sum);
				System.out.println("odd digits product "+pro);
				System.out.println("min number in digit "+min);

		}
	}
				