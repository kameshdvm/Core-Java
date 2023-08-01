package Programs;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array= {1,2,4,5,7,34,5,4,8,6,12};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number you want to Search \n");
		int number=s.nextInt();
		s.close();
		int result = binarySearch(array,number);
		if(result != -1)
		{ System.out.println("The number presented at the position "+result); }
		else
		{ System.out.printf("The Number %d Not Presented in the Array ",number); }
	}

	public static int binarySearch(int[] arr,int target)
	{
		int left=0; int right=arr.length-1;
		
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			
			if(arr[mid]==target)
			{ return mid; }
			
			if(arr[mid]>target)
				{ right=mid-1; }
			else
				{ left=mid+1; }
		}
		
		return -1;
	}
}
