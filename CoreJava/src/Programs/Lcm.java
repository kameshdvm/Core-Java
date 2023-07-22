package Programs;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first Number \n");
		int n1=s.nextInt();
		System.out.println("Enter second Number \n");
		int n2=s.nextInt();
		
		int lcm=(n1>n2)?n1:n2;	//assigning bigger number to lcm
		
		while(true)
		{
			if(lcm%n1==0 && lcm%n2==0)
			{
				System.out.printf("the lcm of %d and %d is %d",n1,n2,lcm);
				break;
			}
			++lcm;
		}
	}

}
