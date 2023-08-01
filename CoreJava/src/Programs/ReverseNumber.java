package Programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int input = s.nextInt();
		int a=input;
		int i=0,j=0;
		
		while(a>0)
		{
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println("Reversed Number is "+j);

	}
	
//	using StringBuffers	
//	public static void main(String[] args)
//	{
//	Scanner s=new Scanner(System.in);
//	System.out.println("Enter The Number..");
//	int input=s.nextInt();	
//	StringBuffer rev=new StringBuffer(Integer.toString(input));
//	StringBuffer reverse = rev.reverse();
//	System.out.println(Integer.parseInt(reverse.toString()));
//
//	}
	
	
//	using for loop
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the Number: ");
//		int input = s.nextInt();
//		int i=0,j=0;
//		for(int a=input;a>0;a=a/10)
//		{
//			i=a%10;
//			j=(j*10)+i;	
//		}
//		if(input==j)
//			System.out.println(" palindrome number");
//		else
//			System.out.println(" not a palindrome number");
//	}
	

}
