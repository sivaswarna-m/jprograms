class Nleap1
	{
		public static void main(String args[])
		{
			int start=1600,end=2000;
			while(start<=end)
			{
				System.out.println((start%4==0&&start%100!=0||start%400==0)?(start%6==0?"leap and divisible by 6":"leap and not divisible by 6"):"not a leap year");
				start++;
			}
		}
	}