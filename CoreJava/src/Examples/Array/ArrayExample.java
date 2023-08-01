package Examples.Array;

import java.util.Arrays;

public class ArrayExample{
	
	public static void main(String[] args) {
        // Single-Dimensional Array
        int[] singleArray = {5, 2, 9, 1, 3};
		
        /*
		 * Another way of Creating Array 
		 * int[] singleArray = new int[4];
		 * singleArray[0]=5; singleArray[1]=10;
		 */
        
        // Accessing elements of the single-dimensional array
        System.out.println("Single-Dimensional Array:");
        for (int i = 0; i < singleArray.length; i++) {
            System.out.println(singleArray[i]);
        }

        // Sorting the single-dimensional array in ascending order
        Arrays.sort(singleArray);
        System.out.println("Sorted Array:");
        for (int i = 0; i < singleArray.length; i++) {
            System.out.println(singleArray[i]);
        }

        // Multi-Dimensional Array
        int[][] multiArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing elements of the multi-dimensional array
        System.out.println("Multi-Dimensional Array:");
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.println(multiArray[i][j]);
            }
        }
	}
	}
