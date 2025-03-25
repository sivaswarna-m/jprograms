import java.util.Scanner;
class Main 
	{
   	 public static void main(String[] args) 
  		{
        	 Scanner s =new Scanner(System.in);
		  System.out.println("number is ");
      		 int num=s.nextInt();
       		 System.out.println("number is "+num);
     		  if(num%2==0)
      			 System.out.println("even");
      		 else
      			 System.out.println("odd");
    }
}