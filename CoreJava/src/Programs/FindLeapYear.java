package Programs;

import java.util.Scanner;

public class FindLeapYear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Year you want to Check: \t");
		int year=s.nextInt();
		s.close();
		if(year%4==0 || year%400==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}
