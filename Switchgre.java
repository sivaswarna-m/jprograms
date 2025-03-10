class Switchgre
	{
	   public static void main(String args[])
	     {
		int n1=99,n2=99;
		char operation='<';
		switch(operation)
		{
		 case '>':
		        System.out.println("greater value is"+(n1>n2?n1:n2));
		 break;
		 case '<':
			System.out.println("Lesser value is"+(n1<n2?n1:n2));
		 break;
		 default:
			System.out.println("Invalid");
		}
		    	}
}
		