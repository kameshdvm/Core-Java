package Examples.ComparableAndComparator;

public class Person  implements Comparable<Person>{
    private String name;
    private int age;
    
    public Person(String name, int age) {	//Comparable interface is used in java for giving natural ordering of our class.
        this.name = name;					//The Comparable interface as only one method called compareTo(<T>).
        this.age = age;						//by using the compareTo() method we define how our class can be sorted by 
    }										//other objects of same type. it return -1 if the compared value is high.	
    										// it give 1 if the compared value is less. it gives 0 if both are equal. 
    public String getName() {
        return name;
    } 
    
    public int getAge() {
        return age;
    }
    
	  @Override public int compareTo(Person other) 
	  {													 // Compare persons based on their age 
	  return Integer.compare(this.age, other.age);
	  }
   
    
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    
}
