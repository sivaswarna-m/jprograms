class  Factors1
	{
		public static void main(String args[])
		{
			int n=6,start=1,end=n,max=1,min=1;
			while(start<end)//1<6 t  2<6 t 3<6 t 4<6 t 5<6 t 6<6  f
			{
			   if(n%start==0)//6%1==0 t 6%2==0 t 6%3==0 t 6%4==0 f 6%5==0 f 			   
			   {
				max=start;//1 2 3 
			   }
		          start++;//1 2 3 4 5 6
			}
			start=1;
			while(end>start)//6>1 t 5>1 t 4>1 t 3>1 2>1 1>1 f
			{			
			   if(n%end==0)// 6%6==0 t 6%5==0 f   6%4==0 f 6%3==0 t  6%2==0 t 		   
			   {
				min=end;//6 3 2
			   }
		          end--;
			}

				System.out.println("largest factor except it self "+max);
				System.out.println("smallest factor except one "+min);
		}
	}