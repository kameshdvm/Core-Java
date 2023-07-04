package Examples.inheritance.multiple;

public class Parent implements Child1,Child2{

	public static void main(String[] args) {
		Parent p=new Parent();
		p.child1Method();
		p.child2Method();
	}
	@Override
	public void child2Method() {
		System.out.println("child 2 method");
		
	}

	@Override
	public void child1Method() {
		System.out.println("child 1 method");
		
	}

}
