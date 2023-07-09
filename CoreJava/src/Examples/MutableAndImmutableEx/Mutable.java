package Examples.MutableAndImmutableEx;

public class Mutable {  
    
	private String s;	// field should be private and final it cannot be accessible outside
    
    Mutable(String s) {  
    this.s = s;  
    }
    
    public String getName() {  //getter and setter method available.se we can change the value
    return s;  
    }  
    public void setName(String coursename) {  
    this.s = coursename;  
    }  
    public static void main(String[] args) {  
    Mutable obj = new Mutable("JavaTpoint");  // Here, we can set the name using the setName method.
    System.out.println(obj.getName());  
    										// Here, we can update the name using the setName method again.  
    obj.setName("Java Training");  
    System.out.println(obj.getName());  
    }  
}