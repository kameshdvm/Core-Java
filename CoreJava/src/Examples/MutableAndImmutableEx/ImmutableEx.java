package Examples.MutableAndImmutableEx;

    final class ImmutableEx {  //class is final it cannot be inherited
    	
    private final String s;  		// field should be private and final it cannot be accessible outside
    
    public ImmutableEx(final String s) {  	
    this.s = s;  
    }  
    
    public final String getName() { 	//only getter method and no setter method 
    return s;  
    }  
    public static void main(String[] args) {  
    ImmutableEx obj = new ImmutableEx("Core Java Training");  
    System.out.println(obj.getName());  
    }  
    }  