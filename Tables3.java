class Tables3
	{
		public static void main(String args[])
		{
			int start=1,end=10,n=8;
			while(start<=end)//(1<=10  2<=10 3<=10 4<=10 5<=10 6<=10 7<=10 8<=10 9<=10 10<=10)t 11<=10 f
			{
				int r=n*start;//8*10 8*9 8*8 8*7 8*6 8*5 8*4 8*3 8*2 8*1

				if(start%2==0)//1%2==0 f 2%2==0 t 3%2==0 f 4%2==0 t 5%2==0 f 6%2==0 t 7%2==0 f 8%2==0 t 9%2==0 f 10%2==0 t
				System.out.println(n+"x"+start+"="+r);//8x2=16 8x4=32 8x6=48 8x8=64 8x10
				start++;//1 2 3 4 5 6 7 8 9 10 11
			}
			start=1;
			while(start<=end)
			{
				int r=n*start;
				if(start%2!=0)//1%2!=0 t 2%2==0 f 3%2==0 t 4%2==0 f 5%2==0 t 6%2==0 f 7%2==0 t 8%2==0 f 9%2==0 t 10%2==0 f
                                System.out.println(n+"x"+start+"="+r);//8x1=8 8x3=24 8x5=40 8x7=56 8x9=72
				start++;//1 2 3 4 5 6 7 8 9 10 11
			}

		
		}
	}