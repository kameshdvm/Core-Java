package Programs;

public class AmstrongNumber {

	public static void main(String[] args) 
	{
		
		for(int input=1;input<=1000;input++)
		{
		
			int i=0,j=0;
			int a=input;
			while(a>0)
			{
				i=a%10;
				j=j+(i*i*i);
				a=a/10;
			}
			if(input==j)
			{
				
				System.out.println("Amstrong number "+input);
			}
		}		
		
	}
//An Armstrong number is a number that is equal to the sum of its own digits,each raised 
// to the power of the number of digits. It is also known as a Narcissistic number
//Example Number: 153
//Digits: 1, 5, 3
//Number of digits: 3
//Calculation: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153	
}
