
import java.util.HashMap;
import java.util.Map;
class Mapjava 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<>();
		map.put(19,"ram");
		map.put(299,"sita");
		map.put(32,"siva");
		map.put(4,"radha");
		System.out.println(map);
		System.out.println(map.get(1));
		map.remove(3);
		System.out.println(map);
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("hi"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		

	}

}
