package Programs;

import java.util.Iterator;

public class Add2dMatrix {

	public static void main(String[] args) {
		
		int row=2,column=3;
		int[][] firstMatrix=  {{1,2,3},{4,5,6}};
		int[][] secondMatrix= {{2,4,6},{1,3,5}};
		
		int[][] sum=new int[row][column];
		
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <column; j++) {
				
				sum[i][j]=firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		
		System.out.println("Sum Of Two Matrix \n");
		
		for(int[] values: sum)
		{
			for(int value:values) {
			System.out.print(value+" ");
			}
		}
	}

}
