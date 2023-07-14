package Examples.Math;

public class MathExample {
    public static void main(String[] args) {
        // Absolute value
        int absoluteValue = Math.abs(-5);
        System.out.println("Absolute value of -5: " + absoluteValue);

        // Maximum of two numbers
        int maxNum = Math.max(10, 15);
        System.out.println("Maximum of 10 and 15: " + maxNum);

        // Minimum of two numbers
        int minNum = Math.min(7, 3);
        System.out.println("Minimum of 7 and 3: " + minNum);

        // Square root
        double sqrtValue = Math.sqrt(16);
        System.out.println("Square root of 16: " + sqrtValue);

        // Power/exponentiation
        double powValue = Math.pow(2, 3);
        System.out.println("2 raised to the power of 3: " + powValue);

        // Rounding to the nearest whole number
        double roundNum = Math.round(4.7);
        System.out.println("Rounding 4.7 to the nearest whole number: " + roundNum);
        
        //Rounding to the nearest lower bound whole number
        double floorNum = Math.floor(4.7);
        System.out.println("Rounding 4.7 to the nearest lowerbound whole number: " + floorNum);
        
        //Rounding to the nearest upper bound whole number
        double ceilNum = Math.ceil(4.7);
        System.out.println("Rounding 4.7 to the nearest upperbound whole number: " + ceilNum);
        
        // Random number between 0.0 (inclusive) and 1.0 (exclusive)
        double randomNum = Math.random();
        System.out.println("Random number between 0 and 1: " + randomNum);

        //Random number between 0.0 (inclusive) and 20 (exclusive)
        double randomTill20 = Math.random()*20;
        System.out.println("Random number between 0 and 20: " + randomTill20);

        // Trigonometric functions (radians)
        double sinValue = Math.sin(Math.PI / 6);
        System.out.println("Sine of 30 degrees: " + sinValue);

        double cosValue = Math.cos(Math.PI / 4);
        System.out.println("Cosine of 45 degrees: " + cosValue);

        double tanValue = Math.tan(Math.PI / 3);
        System.out.println("Tangent of 60 degrees: " + tanValue);

        // Constants
        System.out.println("Value of PI: " + Math.PI);
        System.out.println("Value of Euler's number: " + Math.E);
    }
}
