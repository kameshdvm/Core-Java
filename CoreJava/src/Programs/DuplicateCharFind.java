package Programs;
import java.util.Scanner;
public class DuplicateCharFind 
{	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The String..");
		String input = s.nextLine();
		System.out.println("Duplicate Character is...");
		char[] array=input.toCharArray();
		char temp=array[0];
		int count=0;
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j <input.length(); j++) {
				if(array[i]==array[j])
				{
					temp=array[j];
					
					count++;
					System.out.print(temp+",");
				}	
			}	
		}
		
		System.out.println("duplicate Count is: "+count);
	}

}
