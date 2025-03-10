class Tables2
	{
		public static void main(String args[])
		{
			int start=1,end=10,n=8;
			while(end>=start)//10>=1 t 9>=1 8>=1 7>=1 6>=1 5>=1 4>=1 3>=1 2>=1 1>=1 0>=1 f
			{
				int r=n*end;//8*10 8*9 8*8 8*7 8*6 8*5 8*4 8*3 8*2 8*1
				double s=Math.sqrt(r);//
				if(r%s==0)//80%s==0 f 72%s==0 f 64%s==0 t 56%s==0 f 48%s==0 f 40%s==0 f 32%s==0 f 24%s==0 f 16%s==0 t 8%s==0 f
				System.out.println(n+"x"+end+"="+r);//8x8=64  8x2=16
				end--;//9 8 7 6 5 4 3 2 1 0
			}
		}
	}