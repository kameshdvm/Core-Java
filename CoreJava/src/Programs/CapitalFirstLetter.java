package Programs;

import java.util.Scanner;

public class CapitalFirstLetter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String message=s.nextLine();
		s.close();
		
		String strArray[]=message.split(" "); 
		
		for (int i = 0; i < strArray.length; i++) {
			
			String str=strArray[i];
			
			String firstLetter=str.substring(0,1);
			String remaining=str.substring(1,str.length());
			firstLetter=firstLetter.toUpperCase();
			str=firstLetter+remaining;
			strArray[i]=str;
		}
		
		for (String str : strArray) {
			
			System.out.print(str+" ");
		}
	}

}
