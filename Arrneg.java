class Arrneg
{
   public static void main(String[] args)
    {
	int a[]={10,-3,56,78,24,-7,12,-4,-5,78};
	int b[]=new int[a.length];
	int y=0;
	for(int x=a.length-1;x>=0;x--)
	{
		if(a[x]<0)//78f -5t 
		{
		b[x]=a[x];
		y++;
		System.out.println("b["+y+"]="+b[x]);

		}
	}
	
	
     }
}