class Insurance
{
	public static void main(String args[])
	{
	    int age=28;
	    String gender="male";
	    String health="poor";
	    double policy_amount=50000;
	    String region="village";
	    if(25<=age&&age<=35)
	    {
	    if(gender==("male")&&health==("good")&&region==("city"))
	    {
		System.out.println("eligible for insurance:"+"less than or equal to two lakh"+"\n premium_rate:"+(0.004  *policy_amount));
	    }
            else if(gender=="female" && health=="good" && region=="city")
            {
                System.out.println("eligible for insurance:"+"less than or equal to one lakh"+"\n premium_rate:"+(0.003*policy_amount));
            }
            else if(gender==("male")&&health==("poor")&&region==("village"))
            {
              System.out.println("eligible for insurance:"+"less than or equal to ten thousand"+"\n premium_rate:"+(0.006*policy_amount));
            }
            else
            {
                System.out.println("not eligible for Insurance");
            }
            }
            else
            {
                System.out.println("not eligible for Insurance");
            }
        }
}
