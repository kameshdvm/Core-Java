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
