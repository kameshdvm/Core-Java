package Programs;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		Integer input = s.nextInt();
		int i=0,j=0,a=0;
		for(a=input;a>0;a=a/10)
		{
			i=a%10;
			j=(j*10)+i;	
		}
		if(input.equals(j))
			System.out.println(j+" is palindrome number");
		else
			System.out.println(j+" is not a palindrome number");
	}

}
