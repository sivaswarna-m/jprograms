import java.util.Scanner;
class Strcharmaxc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");		
		String s=sc.nextLine();
		char c=' ';char t=' ';
		int va=0,ve=0,vi=0,vo=0,vu=0,max=0;//Integer.MIN_VALUE;
		for(int x=0;x<s.length();x++)
		{
			 c=s.charAt(x);
			
		if(c=='a'||c=='A')
		{
		va++;
		if(va>ve&&va>vi&&va>vo&va>vu)
		{
			max=va;
			t=c;
		}
		}
		else if(c=='e'||c=='E')
		{
				ve++;

		if(ve>va&&ve>vi&&ve>vo&ve>vu)
		{
			max=ve;
			t=c;
		}
		}
		else if(c=='i'||c=='I')
		{
				vi++;
		 if(vi>va&&vi>ve&&vi>vo&vi>vu)
		{
			max=vi;
			t=c;
		}
		}
		else if(c=='o'||c=='O')
		{
				vo++;

		 if(vo>va&&vo>vi&&vo>ve&vo>vu)
		{
			max=vo;
			t=c;
		}
		}
		else if(c=='u'||c=='U')
		{
				vu++;

		 if(vu>va&&vu>vi&&vu>vo&vu>ve)
		{
			max=vu;
			t=c;
		}
		}
		}
		//System.out.println(va+" "+ve+" "+vi+" "+vo+" "+vu);

		System.out.println(max+" "+t);
	}
}