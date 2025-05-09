import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Freq 
{

	public static void main(String[] args) 
	{
		//Map<Integer,Integer> m=new HashMap<>();
		Map<String,Integer> m=new HashMap<>();
		//ArrayList<Integer> al=new ArrayList<>(Arrays.asList(19,3,4,6,3,63,7,25,90,51,63,19,19,51,9));
		ArrayList<String> al=new ArrayList<>(Arrays.asList("lara","clara","lina","clara","lara","lora","Jay"));
		//for(Integer t:al)
		for(String t:al)
		{
			m.put(t,m.getOrDefault(t, 0)+1);
		}
		System.out.println(m);

	}

}