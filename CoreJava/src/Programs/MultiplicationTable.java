package Programs;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		for(int i=1;i<=10;i++)
		{
			int table=num*i;
			System.out.println(table);
		}
		s.close();
	}
}
