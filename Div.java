class Div
{
     public static void main(String args[])
     {
       int n=2;
	if(n%3==0&&n%5==0)
	  System.out.println("Fizzbuzz");
	else if(n%3==0)
	  System.out.println("Fizz");
	else if(n%5==0)
	  System.out.println("buzz");
	else
	  System.out.println("Invalid");
     }
}