class Nleap2
	{
		public static void main(String args[])
		{
			int start=1,end=10;
			while(start<=end)//1<=10 t 2<=10 t 3<=10 t 4<=10 t 5<=10 6<=10 7<=10
			{
				System.out.print((start%2==0)? start+"\t":"");//1%2==0 f 2%2==0 t 2 3%2==0 f 4%2==0 t 4 5%2==0 f 6%2==0 t 6
			        start++;//2 3 4 5 6 7
			}
		}
	}