class Rec
{
	public static void main(String []args)
	{
		Rec r=new Rec();
		int a[]={11,76,43};
		for(int t:a)
		{
			int res=r.palindrome(t,0);
			if(t==res)
			System.out.println(t+" =palindrome");
		}
		
	}
	int palindrome(int n,int rev)
	{
		if(n==0)
		{
			return rev;
		}
		else
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			return palindrome(n,rev);
		}
	}
}