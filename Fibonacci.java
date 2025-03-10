class Fibonacci 
	{
	  public static void main(String args[])
		{
			int a=0,b=1,c=0,s=1,n=5;
			while(s<=n)//
			{
			  c=a+b;
				System.out.println(c);
			  a=b;
			  b=c;
			  s++;
			}
		}
	}
			  	