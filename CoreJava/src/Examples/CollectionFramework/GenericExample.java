package Examples.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class GenericExample<T> {
    private List<T> elements;

    public GenericExample() {
        elements = new ArrayList<>();
    }

    public void addElement(T element) {
        elements.add(element);
    }

    public T getFirstElement() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(0);
    }

    public static void main(String[] args) {
        GenericExample<String> stringExample = new GenericExample<>();
        stringExample.addElement("Hello");
        stringExample.addElement("World");
        System.out.println("First element: " + stringExample.getFirstElement());

        GenericExample<Integer> integerExample = new GenericExample<>();
        integerExample.addElement(42);
        integerExample.addElement(123);
        System.out.println("First element: " + integerExample.getFirstElement());
    }
}

//In Java generics, `T`, `R`, and other single-letter uppercase identifiers are commonly used as type parameters. 
//They act as placeholders for actual types that will be provided when using the generic class or method.
//These identifiers are not reserved keywords but are widely used as conventions to represent type parameters. 
//However, you can use any valid Java identifier as a type parameter name.
//
//Here's a brief explanation of commonly used single-letter type parameter names:
//
//1. `T`: Stands for "Type" and is the most commonly used type parameter name.
//It represents a generic type and is often used for classes like `List<T>`, `Map<K, V>`, etc.
//
//2. `E`: Stands for "Element" and is used to represent elements of a collection. 
//It's commonly used for classes like `List<E>`, `Set<E>`, etc.
//
//3. `K`: Stands for "Key" and is used to represent keys in key-value pairs. It's often used in classes like `Map<K, V>`.
//
//4. `V`: Stands for "Value" and is used to represent values in key-value pairs. It's also commonly used in classes like `Map<K, V>`.
//
//5. `R`: Stands for "Return type" and is used in generic methods when specifying the return type.
//
//6. `N`: Stands for "Number" and is commonly used for numeric types in generic classes/methods.
//
//Remember that these single-letter type parameters are just conventions, and you can use more descriptive names for type parameters to make your code more readable and maintainable. 
//However, sticking to these conventions can make your code more familiar to other Java developers who are used to them.