package Programs;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int input = s.nextInt();
		int temp=input;
		int i=0,j=0;
		
		while(temp>0)
		{
			i=temp%10;
			j=j*10+i;
			temp=temp/10;
		}
		System.out.println(j);

	}

}
