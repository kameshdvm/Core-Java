package Programs;
import java.util.Scanner;

public class CheckPrimeUsingMethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		checkPrime(num);
	}
	static void checkPrime(int num)
	{
		int count=0;
		for(int i=2;i<=num/2;i++)
		{
		if(num%i==0)
		{
			count=1;
		}
		}
		if(count==0)
		{
			System.out.println(num+" is Prime Number");
		}
		else
		{
			System.out.println(num+" is Not a Prime Number");
		}
	}
}

