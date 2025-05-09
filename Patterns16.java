class Patterns16
{
	public static void main(String args[])
	{
			char cu='A';
			char ch='a';
			for(int r=1;r<=5;r++)
			{
				for(int c=1;c<=4;c++)
				{
					if(r%2==0)
					{
					System.out.print(ch+" ");
					ch++;
					}
					else
					{
						System.out.print(cu+" ");
						cu++;
					}
				}
				System.out.println();
			}
	}
}