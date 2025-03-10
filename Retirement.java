class Scholarship
 {
     public static void main(String args[])
     {
       int age=25;
       if(age>=60)
       {
         String gender="female";
         if(gender=="female")
         {
             System.out.println("retirement amount is 30000 because you are a female senior citizen");
         }
         else
         {
             System.out.println("retirement amount is 35000 because you are a male senior citizen");
         }
      }
      else if(age>=18)
      {
          String g="UG";
          if(g=="UG")
          {
              System.out.println("Scholarship amount is 30000 because you are a under graduate");
          }
          else if(g=="PG")
          {
              System.out.println("Scholarship amount is 40000 because you are a post graduate");
          }
          else
          {
              System.out.println("Scholarship amount is 20000 because you are neither under graduate nor post graduate");
          }
      }
      else
      {
         System.out.println("you are not eligible for retirement or scholarship amount because you are a minor");
      } 
          System.out.println("________________________________________");
          String gender="female";
          String g="UG";

          System.out.println(age>=60?(gender=="female"?30000:35000):(age>=18?(g=="UG"?30000:g=="PG"?40000:20000):"minor"));
    }
}
   