class Private_var//getter-Encapsulation
{
	public static void main(String args[])
	{
		Private_var p=new Private_var();
		System.out.println(p.getnum());
		System.out.println(p.getnum1());
	}
		private int a=10,b=20;
		
		public int getnum()
		{
			return a;
		}
		public int getnum1()
		{
			return b;
		}
}