package Examples.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListEx {

	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(null);
		li.add(50);
		
		System.out.println("all elements "+li);
		System.out.println("Size of List "+li.size());
		System.out.println("element at the index position of 2 is "+li.get(2));
		System.out.println("check the index contains the element "+li.contains(50));
		System.out.println("check the list is empty or not "+li.isEmpty());
		System.out.println("before set elements "+li);
		System.out.println(li.set(2, 25));
		System.out.println("after set elements"+li);
		System.out.println("before remove element"+li);
		System.out.println(li.remove(5));
		System.out.println("after remove element at 5 index"+li);
		System.out.println("index position of the value null "+li.indexOf(null));
		
		System.out.println("Iterator");
		Iterator<Integer> iterator = li.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		li.clear();
		System.out.println("after cleared the list"+li);
		
		
		
	}

}
