package Examples.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingComparator {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		 people.add(new Person("Alice", 25));
	     people.add(new Person("Bob", 30));
	     people.add(new Person("Charlie", 20));
	     
	        System.out.println("Before sorting:");
	        for (Person person : people) {
	            System.out.println(person);
	        }
	        
	        AgeComparator comparator = new AgeComparator();
	        Collections.sort(people, comparator);
	           
	        System.out.println("\nAfter sorting by age:");
	        for (Person person : people) {
	            System.out.println(person);

	        }
	}
	
}
