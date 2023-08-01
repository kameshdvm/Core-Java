package Programs;

import java.util.Arrays;
import java.util.Comparator;

public class Practice
{
	public static void main(String[] args)
	{
	int[][] arr= {{1,2,4},{40,30,50},{23,55}};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			
			Arrays.sort(arr, Comparator.comparingInt(a->a[0]));		
			System.out.println(arr[i][j]);
			
		}
	}
	}
}