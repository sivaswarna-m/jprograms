class Nsquare
	{
		public static void main(String args[])
		{
			int start=20,end=1;
			while(end<=start)
			{
			 if(start%2==0)
			 {
			   int r=(int)Math.sqrt(start);
			  if(r*r==start)
			   {
			     System.out.println(start+" even perfect square ");
			   }
			   else
			   {
		              System.out.println(start+" even  not perfect square ");
			   }
			}
			else
			{
			   int r=(int)Math.sqrt(start);
			  if(r*r==start)
			  {
			     System.out.println(start+" odd perfect square ");
			   }
			   else
			   {
		              System.out.println(start+" odd  not perfect square ");
			   }

			}
			start--;
			}
		}
	}	
