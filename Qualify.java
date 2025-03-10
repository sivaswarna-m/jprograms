class Qualify
	{
	   public static void main(String args[])
		{
		  int A=75,B=30;
		  if(A>=55&&B>=45)
		     System.out.println("student is qualified for a degree");
		  else if(A<55&&B>=55&&A>=45)
		    System.out.println("student is qualified for a degree");
		  else if(A>=65&&B<45)
		    System.out.println("student is allowed to reappear in an examination in B to qualify the degree");
		  else
		    System.out.println("student failed to qualify a degree");
		}
	}


