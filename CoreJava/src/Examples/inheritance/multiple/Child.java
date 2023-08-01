package Examples.inheritance.multiple;

public class Child implements Parent1,Parent2{

	public static void main(String[] args) {
		Child c=new Child();
		c.parent1Method();
		c.parent2Method();
	}
	@Override
	public void parent2Method() {
		System.out.println("parent 2 method");
		
	}

	@Override
	public void parent1Method() {
		System.out.println("parent 1 method");
		
	}

}
