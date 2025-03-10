class Switch
	{
	   public static void main(String args[])
	     {
		int n1=99,n2=6;
		char operation='|';
		int result;
		switch(operation)
		{
		  case '+':
			result=n1+n2;
			break;
		  case '-':
			result=n1-n2;
			break;
		  case '*':
			result=n1*n2;
			break;
		  case '/':
			result=n1/n2;
			break;
		  case '%':
			result=n1%n2;
			break;
                  default:
			result=-1;
			break;
		}
		 System.out.println(result);
	     }
	}
