class Fibonacci 
	{
	  public static void main(String args[])
		{
			int a=0,b=1,c=0,s=1,n=5;
			while(s<=n)//1<=5 t 2<=5 3<=5 4<=5 5<=5 6<=5 f
			{
			  c=a+b;//
				System.out.println(c);
			  a=b;
			  b=c;
			  s++;
			}
		}
	}
			  	