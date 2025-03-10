class Consonant
{
     public static void main(String args[])
     {
       char ch='u';
       if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
       {
          System.out.println(ch+" "+"is vowel");
       }
       else
       {
          System.out.println(ch+" "+"is consonant");
       }
          System.out.println(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ? "vowel":"consonant");
     }
}