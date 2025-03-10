class Alphabet
 {
     public static void main(String args[])
     {
	char c='/';
	if(c>='A'&& c<='Z')
 	   System.out.println((char)(c+32));
	else if(c>='a'&&c<='z')
	   System.out.println((char)(c-32));
	else
	   System.out.println("Invalid");
	
          System.out.println("__________________________________________");
           
          if(c>='A'&& c<='Z')
	    System.out.println("Capital");
	  else if(c>='a'&&c<='z')
	    System.out.println("Small");
	  else if(c>='0'&&c<='9')
	    System.out.println("Digit");
          else if(c==' ')
	    System.out.println("Space");
	  else
	    System.out.println("Symbol");
	  
        }
    }