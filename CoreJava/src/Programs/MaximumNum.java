package Programs;

class MaximumNum {
	public static void main(String[] args) {

		int[] arr = { 23, -34, 50, 74, 55, 43, 5, -66 };
		int length = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[length - 1]);
	}
}