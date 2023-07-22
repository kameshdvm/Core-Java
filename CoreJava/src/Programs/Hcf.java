package Programs;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first Number \n");
		int n1=s.nextInt();
		System.out.println("Enter second Number \n");
		int n2=s.nextInt();
		
	int hcf=1;
	for (int i = 1; i <=n1 && i<=n2; i++) {
		if(n1%i==0 && n2%i==0)
		{
			hcf=i;
		}
	}
		System.out.println("Hcf of "+n1+" and "+n2+" is "+hcf);
	}

}
