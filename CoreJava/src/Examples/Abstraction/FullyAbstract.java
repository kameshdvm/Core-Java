package Examples.Abstraction;

interface FullyAbstract 
{	
	int a=5;					//by default public static final
	
public default void defaultMethod() //from java 8 we create default method in interface
{
	System.out.println("default Method from inteface..");
}
public static void my()	//from java 8 we create static method in interface. but we cannot create static block
{
	System.out.println("static method from interface..");
}
void fullyAbstractMethod();
}

