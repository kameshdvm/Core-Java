package Examples;

public class Printf {

	public static void main(String[] args) {
		String name="Kamesh";
		System.out.printf("Hello %s  ", name);	
		System.out.printf("Hello %20s  ", name);
		System.out.printf("Hello %-20s  ", name);
		System.out.printf("Hello ,%s  ", name);
		
		Integer age=25;
		System.out.printf("Hello %d  ", age);
		
		// %s print String
				// %d print Integer,Long 
				//%f  Float,Double
				//%b Boolean
				//%c Character
	}
}
