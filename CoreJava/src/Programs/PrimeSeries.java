package Programs;

import java.util.Scanner;

public class PrimeSeries {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Count");
		int input=s.nextInt();
		
		for(int i=0;i<input;i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0) {
			System.out.println(i);
			}
			
		}	
	}

}
