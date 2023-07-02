package Programs;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int input = s.nextInt();
		int temp=input;
		int i=0,j=0;
		
		for(int k=temp;k<input;temp=temp/10)
		{
			i=temp%10;
			j=j*10+i;
			
		}
		System.out.println(j);

	}

}
