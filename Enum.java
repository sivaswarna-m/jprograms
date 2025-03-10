class Enum
	{
	  public static void main(String args[])
		{
			int num=11;
			while(num>1)//3>1 t 10>1 t 5>1
			{ 
			  if(num%2==0)//3%2==0 f 10%2==0 t 5%2==0 f 16%2==0 8%2==0 4%2==0 2%2==0
			  {
				num=num/2;//5 8 4 2 1
		          }
			  else
			  {
				num=num*3+1;//10 16
			  }
			 System.out.println(num);//10 5 16 8 4 2 1
			}
		}	 
	}