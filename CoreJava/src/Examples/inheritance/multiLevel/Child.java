package Examples.inheritance.multiLevel;

public class Child extends Father{

	public static void main(String[] args) {
		
		Child c=new Child();
		c.grandFather();
		c.fatherMethod();
	}

}
