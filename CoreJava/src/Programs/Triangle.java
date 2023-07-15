package Programs;

import java.util.Scanner;

public class Triangle 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Integer input = s.nextInt();
		for (int k = 0; k <= input; k++) 
		{
			for (int i = input - k; i > 0; i--) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j <= k * 2; j++) 
			{
				System.out.print("^");
			}
			System.out.println();	
		}
		
	}
}