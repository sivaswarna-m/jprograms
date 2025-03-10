class Content
 {
     public static void main(String args[])
     {
        int hardness=60,tensile_strength=600;
        double carbon_content=0.3;
	if(hardness>50&&carbon_content<0.7&&tensile_strength>5000)
	    System.out.println("grade 10");
	else if(hardness>50&&carbon_content<0.7)
	    System.out.println("grade 9");
	else if(carbon_content<0.7&&tensile_strength>5000)
	    System.out.println("grade 8");
	else if(hardness>50&&tensile_strength>5000)
	    System.out.println("grade 7");
	else if(hardness>50||carbon_content<0.7||tensile_strength>5000)
	    System.out.println("grade 6");
	else
	    System.out.println("garade 5");
      }
  }


