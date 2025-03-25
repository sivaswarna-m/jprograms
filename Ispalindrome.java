class palindrome 
{
		int isPalindrome(int n,int rev,int rem)
		{
			while(n>0)
			{
				rem=n%10;
				rev=rem+rev*10;
				n=n/10;
			}
			return rev;
		}
		String checkPalindrome(int rev)
		{
			if(rev==n)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("not a Palindrome");
			}
		}
}
class main
{
	Palindrome p=new Palndrome();
	int result=p.isPalindrome(141,0,0);
	System.out.println(p.checkPalindrome(result));
}
