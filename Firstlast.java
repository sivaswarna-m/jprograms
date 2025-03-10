class Firstlast
	{
	   public static void main(String args[])
		{
			int n=12345,rem=0,sum=0,rem1=0,f=0,s=0,pro=0;
			
			
				f=n%100;
				s=n/1000;
				while(f>0)//45>0
				{
					rem=f%10;//5
					while(s>0)//12
					{
					   rem1=s/10;//1
					   s=s%10;
					}
					  pro=rem*rem1;
					   f=f/10;
				         System.out.println(pro);
				}
		}
	}