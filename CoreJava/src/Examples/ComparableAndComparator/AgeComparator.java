package Examples.ComparableAndComparator;

import java.util.Comparator;

import Examples.Practice;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {			//Comparator is an interface that can be used for Provide Custom 			
        // Comparison based on age						//Ordering to a Object or Override the Natural Ordering of a Object.
    return Integer.compare(p1.getAge(), p2.getAge());	//for use the Comparator we need to implements the Comparator<T> interface
    													//and implements its only method compare(T o1,T o2) and write custom 
    }													//ordering logics
    public static void main(String[] args) {
    	Practice p=new Practice();
       System.out.println(p);
	}
    
}
