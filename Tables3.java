class Tables3
	{
		public static void main(String args[])
		{
			int start=1,end=10,n=2;
			while(start<=end)
			{
				int r=n*start;
				if(start%2==0)
				System.out.println(n+"x"+start+"="+r);
				start++;
			}
			start=1;
			while(start<=end)
			{
				int r=n*start;
				if(start%2!=0)
				System.out.println(n+"x"+start+"="+r);
				start++;
			}

		
		}
	}