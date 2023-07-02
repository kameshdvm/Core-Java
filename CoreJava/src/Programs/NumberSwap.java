package Programs;

import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = s.nextInt();
		System.out.println("Enter the Second Number");
		int b = s.nextInt();
		System.out.println("Before Swap a "+a);
		System.out.println("Before Swap a "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap a "+a);
		System.out.println("After Swap a "+b);
	}

}
