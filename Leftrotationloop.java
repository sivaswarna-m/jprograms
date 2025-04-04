class Leftrotationloop
{
	public static void main(String[] args)
	{
	int a[]={10,20,30,40,50};
	System.out.println("array elements are");
	 for(int t:a)
	  {
		System.out.println(t);
	  }

	int x=0,rotations=4;
	for(int r=1;r<=rotations;r++)
	{
		int b=a[0];
	   for(x=0;x<a.length-1;x++)
	   {	
				
		a[x]=a[x+1];
	   }
	  a[x]=b;
		System.out.println("array elements after rotation"+r);

	  for(int t:a)
	  {
		System.out.println(t);
	  }
	}
	}
}