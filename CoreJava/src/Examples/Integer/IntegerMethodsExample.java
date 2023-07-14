package Examples.Integer;

public class IntegerMethodsExample {
    @SuppressWarnings("removal")
	public static void main(String[] args) {
        // Creating Integer objects
        
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(20);

        // intValue() - Converts Integer to int
        int value1 = num1.intValue();
        int value2 = num2.intValue();
        System.out.println("intValue():"); 
        System.out.println("num1: " + value1);
        System.out.println("num2: " + value2);

        // compareTo() - Compares two Integers numerically
        int compareResult = num1.compareTo(num2);
        System.out.println("compareTo():");
        if (compareResult < 0) {
            System.out.println("num1 is less than num2");
        } else if (compareResult > 0) {
            System.out.println("num1 is greater than num2");
        } else {
            System.out.println("num1 is equal to num2");
        }

        // parseInt() - Parses a String to an Integer
        String str = "30";
        Integer parsedNum = Integer.parseInt(str);
        System.out.println("parseInt():");
        System.out.println("Parsed Integer: " + parsedNum);

        // valueOf() - Returns an Integer object from a String
        Integer valueOfNum = Integer.valueOf("40");
        System.out.println("valueOf():");
        System.out.println("ValueOf Integer: " + valueOfNum);

        // toString() - Converts Integer to String
        String strValue = num1.toString();
        System.out.println("toString():");
        System.out.println("String representation of num1: " + strValue);

        // sum() - Returns the sum of two Integers
        int sum = Integer.sum(num1, num2);
        System.out.println("sum():");
        System.out.println("Sum of num1 and num2: " + sum);

        // max() - Returns the larger of two Integers
        int maxNum = Integer.max(num1, num2);
        System.out.println("max():");
        System.out.println("Larger of num1 and num2: " + maxNum);

        // min() - Returns the smaller of two Integers
        int minNum = Integer.min(num1, num2);
        System.out.println("min():");
        System.out.println("Smaller of num1 and num2: " + minNum);
  
    }
}
