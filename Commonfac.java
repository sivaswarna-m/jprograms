class  Commonfac
	{
		public static void main(String args[])
		{
			int n1=30,n2=18,s=1,max=0,min=0;
			
			while(s<n2)
			{
			  if(n1%s==0&&n2%s==0)//
			  {
				System.out.println(s);//
				max=s;
			  }
			  s++;
			} 
			s=1;
			while(s<n2)
			{
			  if(n1%s==0&&n2%s==0)//
			  {
				min=n2;
			  }
			  n2--;
			}

				System.out.println("greatest common factor is "+max);
				System.out.println("second smallest common factor is "+min);

		}
	}