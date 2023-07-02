package Programs;
import java.util.Scanner;

public class FactorialTill {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter ending position of factorial");
		int num = s.nextInt();
		int factorial=1;
		for(int i=1;i<num;i++)
		{
			factorial=factorial*i;
			if(factorial>=num) {
				break;
			}
			System.out.println(factorial);
		}
		
	}
}
