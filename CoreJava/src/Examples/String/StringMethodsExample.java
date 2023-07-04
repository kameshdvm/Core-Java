package Examples.String;

public class StringMethodsExample {
    public static void main(String[] args) {
        // length()
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // charAt()
        char ch = str.charAt(1);
        System.out.println("Character at index 1: " + ch);

        // substring()
        String substring1 = str.substring(7);
        String substring2 = str.substring(7, 12);
        System.out.println("Substring from index 7 to end: " + substring1);
        System.out.println("Substring from index 7 to 12 (exclusive): " + substring2);

        // concat()
        String str1 = "Hello";
        String str2 = "World";
        String result = str1.concat(str2);
        System.out.println("Concatenated string: " + result);

        // toUpperCase()
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase string: " + uppercase);

        // toLowerCase()
        String lowercase = str.toLowerCase();
        System.out.println("Lowercase string: " + lowercase);

        // trim()
        String str3 = "  Hello, World!  ";
        String trimmed = str3.trim();
        System.out.println("Trimmed string: " + trimmed);

        // replace()
        String replaced = str.replace('o', 'e');
        System.out.println("Replaced string: " + replaced);

        // split()
        String str4 = "Hello,World,Java";
        String[] arr = str4.split(",");
        System.out.print("Split string: ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();

        // startsWith()
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("String starts with 'Hello': " + startsWithHello);

        // endsWith()
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("String ends with 'World!': " + endsWithWorld);

        // contains()
        boolean containsHello = str.contains("Hello");
        System.out.println("String contains 'Hello': " + containsHello);

        // indexOf()
        int index = str.indexOf('o');
        System.out.println("Index of 'o': " + index);

        // lastIndexOf()
        int lastIndex = str.lastIndexOf('o');
        System.out.println("Last index of 'o': " + lastIndex);
    }
}
