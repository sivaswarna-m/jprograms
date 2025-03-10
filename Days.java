class Days
	{
		public static void main(String args[])
			{
				int days=457;
				int y=days/365;
				double r=(days%365);
				int m=(int)(r/31);
				double d=(r%31);
				System.out.println(y+" years"+" "+ m+" months"+" "+ d+" days");
			}
	}