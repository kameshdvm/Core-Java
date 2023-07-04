package Examples.Abstraction;

public class MyClass extends PartiallyAbstract implements FullyAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	@Override
	public void abstractMethod() {			//Automatically implemented Override method from PartiallyAbstract class
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void normalmethod()				//manually Override the method from PartiallyAbstract class
	{
		System.out.println("Normal Method..");
	}


	@Override
	public void fullyAbstractMethod() {		//Automatically implemented Override method from FullyAbstract interface
		// TODO Auto-generated method stub
		
	}
	@Override
	public void defaultMethod()		//manually Override the method from FullyAbstract interface 
	{
		System.out.println("hello");
	}
	
}
