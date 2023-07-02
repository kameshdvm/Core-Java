package Programs;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int input=s.nextInt();
		int count=0;
		for(int i=2;i<=input/2;i++)
		{
		if(input%i==0)
		{
			count=1;
		}
		}
		if(count==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not a Prime");
		}
	}

}
