class Demo4
{
	public static void main(String[] args)
	{
		String s="geeks";
		String r="";
		char ch=0;
		for(int x=0;x<s.length();x++)
		{
			
			ch=s.charAt(x);//g e
			r=ch+r;// g eg
			System.out.println(r);

		}
			System.out.println(r);
	}
}