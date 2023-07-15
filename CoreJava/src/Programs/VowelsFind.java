package Programs;

import java.util.Scanner;

public class VowelsFind {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String input = s.nextLine().toLowerCase();
	
	char[] ch=input.toCharArray();
	int vowels=0,consonants=0,numbers=0,specialChar=0;

	for(int i=ch.length-1;i>=0;i--)
	{
		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
		{
			
			vowels++;
			
		}
		else if(ch[i]>='a' && ch[i]<='z'){
			consonants++;
		}
		else if(ch[i]>='1' && ch[i]<='9')
		{
			numbers++;
		}
		else
		{
			specialChar++;
		}
	}
	System.out.println("\nvowels "+vowels);
	System.out.println("consonants "+consonants);
	System.out.println("numbers "+numbers);
	System.out.println("special Characters "+specialChar );
	}
		
	}

