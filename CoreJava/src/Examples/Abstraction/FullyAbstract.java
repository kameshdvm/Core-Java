package Examples.Abstraction;

public interface FullyAbstract {
	
	int a=5;					//by default public static final
	
void fullyAbstractMethod();		//by default public static final


public default void defaultMethod() //from java 8 we create default method in interface
{
	System.out.println("default Method from inteface..");
}
}
