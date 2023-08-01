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
	        
	        
	        Collections.sort(people, new AgeComparator());    //using separate class for comparator 
	        
	        //people.sort((p1, p2) -> p1.getAge() - p2.getAge());	//using lamda function comparator
	        
	        //people.sort((p1, p2) -> p1.getName().compareTo(p2.getName())); name comparator using lamda
	           
	        System.out.println("\nAfter sorting by age:");
	        for (Person person : people) {
	            System.out.println(person);

	        }
	}
	
}
