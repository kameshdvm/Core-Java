package Examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practice {
    
	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.contains(2));
		System.out.println(s.remove(3));
		
		Iterator <Integer> it=s.iterator();
		
		while(it.hasNext())
		{
		System.out.println(it.next());
		}

		s.clear();


		

		 
		
		
	}
	
}

