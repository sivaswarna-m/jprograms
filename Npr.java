class Npr
	{
		public static void main(String args[])
		{
			int n=5,r=3,start=1,end=n;
			while(start<=end)
			{
			  int product1=1;
			  product1*=start;
			  start++;
			}
			System.out.println(product1);
			int nr=n-r;
			start=1;
			while(start<=nr)
			{
			  int product2=1;
			  product2*=start;
   			    start++;
			}
			System.out.println(product2);
			System.out.println(product1/product2);

			
		}
	}
