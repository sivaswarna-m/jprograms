class Primepalindrome1
	{
	   public static void main(String args[])
		{
			int n=193,rem=0,t=n,c=0,rev=0,start=0;
			do
			{
			    start++;
				c++;
			}
			while(n%start==0);
			do
			{			
			    rem=n%10;
			    rev=rev*10+rem;
			    n=n/10;
			}
			while(n>0);

			n=t;
				System.out.println(c==2?(n==rev?"prime palindrome":"not a  prime palindrome"):"not prime");
		}
	}