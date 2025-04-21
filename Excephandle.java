class Excephandle
{
	public static void main(String args[])
	{
		Handle h=new Handle();
		h.m1();
	}
}
class Handle
{
	int a[]={1,3,4};
	public void m1()
	{
	  try
	  {
	   System.out.println(a[4]);
		System.out.println(a[2]);
	  }catch(ArrayIndexOutOfBoundsException c)
	  {
		System.out.println("exception handled");
	   }
	}
}