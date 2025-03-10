class Numeven
 {
     public static void main(String args[])
     {
       int n=25;
       if(n%2==0)
       {
          double r=Math.sqrt(n);
          if(n%r==0)
          {
            System.out.println(n+"even and perfect square");
          }
          else
          {
            System.out.println(n+"even and  not a perfect square");
          }
       }
       else
       {  
          int n1=n%10;
          if(n1%5==0)
          {
             System.out.println(n+"odd and last digit is divisible by 5");
          }
          else
          {
             System.out.println(n+"odd and last digit is  not divisible by 5");
          }
       }
     }
}