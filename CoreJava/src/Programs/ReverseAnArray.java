package Programs;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr= {20,30,40,50,10,20,70};
		System.out.println("Before Reverse ");
		for(int i:arr)
		{
		System.out.println(i);
		}
		reverseArray(arr);
		System.out.println("After Reverse ");
		for(int i:arr)
		{
		System.out.println(i);
		}
	}
	public static void reverseArray(int[] arr) {
	    int left = 0;
	    int right = arr.length - 1;
	    while (left < right) {
	        int temp = arr[left];
	        arr[left] = arr[right];
	        arr[right] = temp;
	        left++;
	        right--;
	    }
	}

}
