package Programs;
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = s.nextLine();
		String reverse="";
		for (int i =input.length()-1; i>=0; i--) {
			reverse=reverse+input.charAt(i);
		}
		System.out.println(reverse);
		if(input.equalsIgnoreCase(reverse))
		{
			System.out.println("Palindrome String ");
		}
		else
		{
			System.out.println("Not a Palindrome String");
		}
	}

}
