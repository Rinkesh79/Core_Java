package Map;

import java.util.TreeMap;

public class TreeMap1 {
	
	
	public static void main(String[] args) {
		
		
		
		TreeMap map= new TreeMap();
		
		map.put(1, "r");
		map.put(3, null);
		map.put(2, 123);
		map.put(7, "last:");
		
		System.out.println(map);
		//System.out.println(map.get(2));
		//System.out.println(map.get(3));
		
		
	
		
		System.out.println(map.descendingKeySet());
		System.out.println(map.descendingMap());
		
		
		System.out.println(map.firstKey());
		System.out.println(map.firstEntry());
		
		System.out.println(map.lastKey());
		System.out.println(map.lastEntry());
		
		System.out.println(map.floorEntry(6));
		System.out.println(map.floorEntry(7));
		System.out.println(map.floorEntry(8));
		System.out.println(map.floorEntry(9));
		
		System.out.println(map.floorKey(6));
		System.out.println(map.floorKey(7));
		System.out.println(map.floorKey(8));
		System.out.println(map.floorKey(9));
		
		System.out.println(map.higherKey(1));
		System.out.println(map.higherKey(3));
		System.out.println(map.higherKey(7));
	    System.out.println(map.higherKey(8));
	     
	     
	    System.out.println(map.higherEntry(1));
		System.out.println(map.higherEntry(3));
		System.out.println(map.higherEntry(7));
		System.out.println(map.higherEntry(8));
		
		
		
		
		System.out.println(map.lowerKey(1));
		System.out.println(map.lowerKey(3));
		System.out.println(map.lowerKey(7));
	    System.out.println(map.lowerKey(8));
	     
	     
	    System.out.println(map.lowerEntry(1));
		System.out.println(map.lowerEntry(3));
		System.out.println(map.lowerEntry(7));
		System.out.println(map.lowerEntry(8));
		
		
		
		
		
		
		
		System.out.println(map.remove(1));
		System.out.println(map);
		
		
		map.clear();
		System.out.println(map);
		
	}

}
