package Examples;

@FunctionalInterface
interface myinterface
{
	void calc(int a,int b);
}

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		
		myinterface i=(int a,int b)->System.out.println(a+b);
		
		i.calc(5,4);
	}

}
