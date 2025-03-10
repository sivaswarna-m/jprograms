class Nleap
	{
		public static void main(String args[])
		{
			int start=1600,end=2000;
			while(start<=end)
			{
				 if(start%4==0&&start%100!=0||start%400==0)
				 {
				   System.out.println(start+" is a leap year");
				   if(start%6==0)
				   
					System.out.println(start+" is a leap year and divisible by 6");

				 }
				 else
				 {
				   System.out.println(start+" is not a leap year");
				 }
				 start++;
			}
		}
	}

