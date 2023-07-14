package Examples.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        // Example: sort(List<T> list)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        Collections.sort(numbers);
        
        System.out.println("Sorted list: " + numbers); // Output: [1, 2, 5, 8]

        // Example: reverse(List<T> list)
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Collections.reverse(names);
        System.out.println("Reversed list: " + names); // Output: [Charlie, Bob, Alice]

        // Example: shuffle(List<T> list)
        List<Integer> shuffledNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.shuffle(shuffledNumbers);
        System.out.println("Shuffled list: " + shuffledNumbers); // Output: [3, 5, 2, 1, 4] (Random order)

        // Example: max(Collection<? extends T> coll)
        List<Integer> numberList = Arrays.asList(5, 2, 8, 1);
        Integer maxNumber = Collections.max(numberList);
        System.out.println("Max number: " + maxNumber); // Output: 8

        // Example: min(Collection<? extends T> coll)
        List<String> nameList = Arrays.asList("Alice", "Bob", "Charlie");
        String minName = Collections.min(nameList);
        System.out.println("Min name: " + minName); // Output: Alice
    }
}

