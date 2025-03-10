class Reverse2
	{
	   public static void main(String args[])
		{
			int n=12798,rev=0,rem=0,count1=0,count2=0,t=n,rem1=0,rev2=0,a=0;
			while(n>0)
			{
			  count1++;
			  n=n/10;
			}
			n=t;
			while(n>0)
			{
			    rem=n%10;
			    rev=rev*10+rem;
			    n=n/10;
			}
				System.out.println(rev);
			a=rev;
			while(rev>0)
			{
				count2++;
				rev=rev/10;
			}
		        rev=a;
			while(rev>0)
			{
				rem1=rev%10;
				switch(rem1)
				{
					case 0:
						System.out.println("zero");
						break;
					case 1:
						System.out.println("one");
						break;
					case 2:
						System.out.println("two");
						break;
					case 3:
						System.out.println("three");
						break;
					case 4:
						System.out.println("four");
						break;
					case 5:
						System.out.println("five");
						break;
					case 6:
						System.out.println("six");
						break;
					case 7:
						System.out.println("seven");
						break;
					case 8:
						System.out.println("eight");
						break;
					case 9:
						System.out.println("nine");
						break;
				}

				rev2=rev2*10+rem1;
				rev=rev/10;
			}
			int c=count1-count2;
			while(c>0)
			{
				rev2=rev2*10;
				int p=0;
				p=rev2%10;
				
				switch(p)
				{
					case 0:
						System.out.println("zero");
						break;
					case 1:
						System.out.println("one");
						break;
					case 2:
						System.out.println("two");
						break;
					case 3:
						System.out.println("three");
						break;
					case 4:
						System.out.println("four");
						break;
					case 5:
						System.out.println("five");
						break;
					case 6:
						System.out.println("six");
						break;
					case 7:
						System.out.println("seven");
						break;
					case 8:
						System.out.println("eight");
						break;
					case 9:
						System.out.println("nine");
						break;
				}

				c--;
			}
				System.out.println(rev2);

		}
	}