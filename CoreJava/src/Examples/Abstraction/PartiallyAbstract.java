package Examples.Abstraction;

 public abstract class PartiallyAbstract {
	
	PartiallyAbstract()		//abstract class can have constructor 
	{
			System.out.println("abstract class constructor");		
	}

	public abstract void abstractMethod();
	public void normalmethod()
	{
		
		System.out.println("Normal Method..");
	}
}