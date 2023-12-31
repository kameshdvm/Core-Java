package Examples.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter your age");
    	int age=s.nextInt();
        try {
            divide(age, 0);
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        finally
        {
        	s.close();
        }
        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught InvalidAgeException: " + e.getMessage());
        }
    }

    // Method that throws an exception using "throws" keyword
    public static void divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        int result = num1 / num2;
        System.out.println("Result: " + result);
    }

    // Custom exception class
    static class InvalidAgeException extends Exception {
       
		private static final long serialVersionUID = 1L;

		public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Method that throws a custom exception using "throw" keyword
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("Age is valid: " + age);
    }
}

