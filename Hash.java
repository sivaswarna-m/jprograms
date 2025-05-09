import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

 class Hash 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> m=new HashMap();
		m.put(11,"lala");
		m.put(1,"lila");
		m.put(3,"lola");
		m.put(87,"lora");
		/*m.putIfAbsent(6," laila");
		m.putIfAbsent(1," lina");
		System.out.println(m);
		m.compute(78,(k,v)->(v==null)?"lara":v.concat("clara"));
		System.out.println(m);
		m.compute(3,(k,v)->(v==null)?"lara":v.concat("how are you"));
		System.out.println(m);
		m.computeIfAbsent(66,k->"jay");
		m.computeIfAbsent(3,k->" null");
		System.out.println(m);
		m.computeIfPresent(87,(k,v)->v.toUpperCase());
		System.out.println(m);*/
		String s=m.getOrDefault(6,"Asiya");
		String s1=m.getOrDefault(11, "Siva");
		System.out.println("6==>"+s);
		System.out.println("11==>"+s1);
		System.out.println(m);
		/*for(Entry<Integer,String> x:m.entrySet())//using entry 
		{
			if(x.getKey()%3==0)
				System.out.println(x.getValue()+" "+x.getKey()+"\n");
			if(x.getKey().equals(1))
				System.out.println(x.getValue()+" "+x.getKey()+"\n");
			if(x.getValue().equals("g"))
				System.out.println(x.getValue()+" "+x.getKey()+"\n");
			
		}*/
	}
}
