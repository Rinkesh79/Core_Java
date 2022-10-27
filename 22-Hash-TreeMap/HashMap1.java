package Map;

import java.util.HashMap;


public class HashMap1 {
	
	
public static void main(String[] args) {
		
		
		
	    HashMap map=new HashMap();
		
		map.put(1, "r");
		map.put(3, null);
		map.put(2, 123);
		map.put(7, "last:");
		
		System.out.println(map);
		System.out.println(map.size());
		
		//System.out.println(map.get(2));
		//System.out.println(map.get(3));
		
		
	
		
		System.out.println(map.containsKey(8));
		System.out.println(map.containsKey(1));
		
		System.out.println(map.containsValue("r"));
		System.out.println(map.containsValue(1));
		
		
		System.out.println(map.isEmpty());
		
	
		System.out.println(map.remove(1));
		System.out.println(map);
		
		
		map.clear();
		System.out.println(map);
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.size());
		
		
		
	}


}
