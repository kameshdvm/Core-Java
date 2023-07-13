package Programs;

public class BubleSort {

	public static void main(String[] args) {
		int array[] = { 30, 20, 40, 50, 10 };
		int length = array.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println(array[i]);
		}

	}
}