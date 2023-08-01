package Examples.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
	
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(10);
		s.add(60);
		s.add(50);
		s.add(null);
		
		
		System.out.println("all elements "+s);
		System.out.println("Size of List "+s.size());
		System.out.println("check the index contains the element "+s.contains(50));
		System.out.println("check the list is empty or not "+s.isEmpty());
		System.out.println("before remove element"+s);
		System.out.println(s.remove(60));
		System.out.println("after remove element at 5 index"+s);
		System.out.println("Iterator");
		Iterator<Integer> iterator = s.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		s.clear();
		System.out.println("after cleared the list"+s);
	
	}

}
