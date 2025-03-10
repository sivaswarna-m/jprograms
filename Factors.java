class  Factors
	{
		public static void main(String args[])
		{
			int n=6,start=1,end=n,sum=0,product=1,count=0;
			System.out.println("factors of "+ n+" are");
			while(start<=end)//1<=6 t  2<=6 t 3<=6 t 4<=6 t 5<=6 t 6<=6 t 7<=6 f
			{
			   if(n%start==0)//6%1==0 t 6%2==0 t 6%3==0 t 6%4==0 f 6%5==0 f 6%6==0 t 
			   {
				System.out.println(start);//1 2 3 6
				sum+=start;//1+2+3+6
				product*=start;//1*2*3*6
				count++;//1 2 3 4
			    }
			   start++;//1 2 3 4 5 6 7
			}
				System.out.println("sum of factors is "+sum);//12
				System.out.println("product of factors is "+product);//36
				System.out.println("no of factors is "+count);//4
				System.out.println(count==2?"is a prime number":"not a prime number");
				System.out.println(count==4?"is a super number":"not a super number");

		}
	}