package Examples;

public class StaticBlock {

	StaticBlock()	//Constructor
	{
		System.out.println("Constructor");
		final int a=0;//we cannot declare public or static inside the constructor
	}
	
	
	static		//Static Block-executed only once at a class loading time and we cannot use modifiers with it.
	{
		System.out.println("Static");
		int a=5;
		//public static  int a=0;//we cannot declare public or static inside the static block
	}
	

	{//Not Static Block- executed every time of a object creation like constructor
		
		System.out.println("not static block"); 
		//public static final int a=0;//we cannot declare public or static inside the not static block
	}

	static void test()		//Static Method-accessed without object creation
	{
		//this, super(); we cannot use this keyword or super inside static block or method
		System.out.println("Static Method");
		 //public static final int a=0;//we cannot declare public or static inside the method 
	}
	
	public static void main(String[] args) {
		
		StaticBlock p =new StaticBlock();
		StaticBlock p1 =new StaticBlock();		
		StaticBlock.test();
		
	}

}
