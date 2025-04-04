class Insert_k
{
	public static void main(String[] args)
	{
	int a[]={10,20,30,40,50,60,70,0};//10 20 30 35 40 50 60 70
		int x=0,i=3;	  //  0  1  2  3  4  5
		int insert=35;
		System.out.println(a.length-2);
	   for(x=a.length-2;x>=i;x--)
	   {	
		a[x+1]=a[x];//a[7]=70 a[6]=60 a[5]=50 a[4]=40 	
		
	   }
	   a[i]=insert;
	   for(int t:a)
		{
			System.out.println(t);
		}
	
	}
}