package Examples.inheritance.hybrid;

public class Sub extends Parent implements Interface1,Interface2 {

	public static void main(String[] args) {
		 Sub myObj = new Sub();
	        myObj.method1();
	        myObj.method2();
	        myObj.method3();

	}

	@Override
	public void method2() {
		 System.out.println("Method 1 implementation");
		
	}

	@Override
	public void method1() {
		 System.out.println("Method 2 implementation");		
	}

}
