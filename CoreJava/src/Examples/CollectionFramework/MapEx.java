package Examples.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapEx {

	public static void main(String[] args) {
		Map<Integer, Integer> m=new HashMap<>();
		m.put(1, null);
		m.put(null, 3);
		m.put(2, null);
		m.put(3, 5);
		m.put(3, 5);
		m.put(4, 7);
		System.out.println(m);
		System.out.println("Size of Map "+m.size());
		System.out.println("element at the index position of 2 is "+m.get(2));
		System.out.println("before set elements "+m);
		System.out.println(m.replace(4, 25));
		System.out.println("after set elements"+m);
		System.out.println("before remove element"+m);
		System.out.println(m.remove(5));
		System.out.println("after remove element at 5 index"+m);
		System.out.println("check the list is empty or not "+m.isEmpty());
		System.out.println("check the list contains the key "+m.containsKey(3));
		System.out.println("check the list contains the value "+m.containsValue(5));
		System.out.println("Key with value iterator.");
		
		Iterator<Entry<Integer, Integer>> iterator = m.entrySet().iterator();
		while(iterator.hasNext())
		{
			System.out.println( iterator.next());
		}
		
		System.out.println("Key only iterator");
		Iterator<Integer> iterator2 = m.keySet().iterator();
		while(iterator2.hasNext())
		{
			System.out.println(iterator2.next());
		}
		
		System.out.println("Values only iterator");
		Iterator<Integer> iterator3 = m.values().iterator();
		while(iterator3.hasNext())
		{
			System.out.println(iterator3.next());
		}
		
		m.clear();
		System.out.println("after cleared the list"+m);
		

	}

}
