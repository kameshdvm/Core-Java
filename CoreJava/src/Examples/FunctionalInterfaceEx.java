package Examples;

@FunctionalInterface		//it contains only one abstract methods and many default methods
 interface myinterface		
{
	void calc(int a,int b);
}

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		
		myinterface i=(int a,int b)->System.out.println(a+b);
		
		i.calc(5,4);
	}
static void my() {
	System.out.println("static method from functonal interface..");
}
}
