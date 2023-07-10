package Programs;

public class AmstrongNumber {

	public static void main(String[] args) 
	{
		
		for(int i=1;i<=1000;i++)
		{
			boolean checkAmstrong = checkAmstrong(i);
			if(checkAmstrong)
			{
				System.out.println("Amstrong number "+i);
			}
		}
	}
//An Armstrong number is a number that is equal to the sum of its own digits,each raised 
// to the power of the number of digits. It is also known as a Narcissistic number
//Example Number: 153
//Digits: 1, 5, 3
//Number of digits: 3
//Calculation: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

	static boolean checkAmstrong(int num)
		{
		int i=0,j=0;
		int a=num;
		while(a>0)
		{
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		Boolean amstrong=false;
		if(num==j) {
		amstrong=true;	
		}
		return amstrong;
	}
}
