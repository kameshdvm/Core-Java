package Programs;
class Main {
  public static void main(String[] args) {

    int[] numArray = { 23, -34, 50, 33, 55, 43, 5, -66 };

    int largest = numArray[0];

    for (int num : numArray) {
      if (largest < num) {
        largest = num;
      }
    }

    System.out.println("Largest Element: " + largest);
  }
}