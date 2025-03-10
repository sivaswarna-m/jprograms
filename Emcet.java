class Emcet
 {
     public static void main(String args[])
     {
	int marks=150;
	String caste="general";
   	String attempt="true";
	if(attempt=="true")
	{
	if(caste=="general"||caste=="b")
	{
	  if(marks>=40)
	  {
	    System.out.println("eligible");
	    if(marks>160)
	    {
	        System.out.println("Invalid");
            }
            else if(marks>=150)
	    {
		System.out.println(marks+"marks"+" "+"rank is between 1 to 20 ");
	    }
	    else if(marks>=130)
	    {
	 	System.out.println(marks+"marks"+" "+"rank is between 21 to 500");
	    }
	    else if(marks>=100)
	    {
	 	System.out.println(marks+"marks"+" "+"rank is between 501 to 5000");
	    }
	    else if(marks>=70)
	    {
		System.out.println(marks+"marks"+" "+"rank is between 5001 to 20000");
	    }
	    else if(marks>=50)
	    {
		System.out.println(marks+"marks"+" "+"rank is between 20001 to 30000");
	    }
	    else if(marks>=40)
	    {
		System.out.println(marks+"marks"+" "+"rank is above 30000 ");
	    }
	    else 
	    {
		System.out.println(marks+"marks"+" "+"not qualified");
	    }
	  }
  	 else
	 {
	    System.out.println(marks+"not qualified");
         }

      }
	      
      else if(caste=="sc"||caste=="st")
      {
	 System.out.println("qualified");
      }
        int rank=13;
	if(rank<1)
        {
    	  System.out.println("Invalid");
        }
        else if(rank<=20)
        {
    	  System.out.println(rank+"JNTUHCEH Hyderabad"+" "+"CSE/IT/AIDS");
	}
	else if(rank<=500)
        {
	   System.out.println(rank+"CBIT Hyderabad"+" "+"CSE/IT/EEE/AI");
	}
	else if(rank<=2500)
        {
	   System.out.println(rank+"CVR College of Engineering"+" "+"IT/CSE/CIVIL");
	}
	else if(rank<=5000)
        {
	   System.out.println(rank+"University College of Engineering, Osmania University"+" "+"IT/CSE/CIVIL/MECH");
	}
	else if(rank<=10000)
        {
	   System.out.println(rank+"JNTUH College of Engineering, Sultanpur"+" "+"AI/IT/CSE/CIVIL");
	}
	else if(rank<=25000)
        {
	   System.out.println(rank+"AAR Mahaveer Engineering College"+" "+"MECH/CIVIL/ECE/EEE");
	}
	else if(rank<=35000)
        {
	   System.out.println(rank+"Geethanjali College of Engineering and Technology"+" "+"CSE/MECH/CIVIL/EEE");
	}
	else if(rank<=40000)
        {
	   System.out.println(rank+"Vardhaman College of Engineering"+" "+"CIVIL/MECH/EEE");
	}
	else
	{
	   System.out.println(rank+"other college");
	}
       }
      else
      {
	System.out.println("not eligible for selection");
      }
      
    }
  }


	   