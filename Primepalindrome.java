class Primepalindrome
	{
	   public static void main(String args[])
		{
			int n=153,rem=0,t=n,c=0,rev=0;
			while(n>0)
			{
			    c++;
			    n=n/10;
			}
			n=t;
			while(n>0)
			{
			    rem=n%10;
			    rev=rev*10+rem;
			    n=n/10;
			}
			n=t;
				System.out.println((c==2&&n==rev)?"prime palindrom":"not a  prime palindrome");
		}
	}