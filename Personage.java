class Personage
{
     public static void main(String args[])
     {
       int n=-111;
       if(n<0)
       {
          System.out.println("invalid");
       }
       else if(n<10)
       {
          System.out.println("kid");
       }
       else if(n<18)
       {
          System.out.println("minor");
       }
       else if(n<=60)
       {
          System.out.println("major");
       }
       else if(n<=100)
       {
          System.out.println("senior citizen");
       }
       else
       {
          System.out.println("invalid");
       }
     }
}