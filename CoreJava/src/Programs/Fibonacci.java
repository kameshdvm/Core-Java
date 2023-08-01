package Programs;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number");
		 int input=s.nextInt();
		 s.close();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<input;i++)
		{
			int c=a+b;
//			if(c>=input)	//set the ending value example: input=500 it print till within a range 500
//			{
//				break;
//			}
			System.out.println(c);
			a=b;
			b=c;
			
		}

	}

}
