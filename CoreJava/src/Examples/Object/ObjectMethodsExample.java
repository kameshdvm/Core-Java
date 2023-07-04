package Examples.Object;

public class ObjectMethodsExample {
    public static void main(String[] args) {
        // Creating objects
        Object obj1 = new Object();
        Object obj2 = new Object();

        // toString()
        System.out.println("toString():");
        System.out.println(obj1.toString());

        // equals()
        System.out.println("\nequals():");
        boolean isEqual = obj1.equals(obj2);
        System.out.println("obj1.equals(obj2): " + isEqual);

        // hashCode()
        System.out.println("\nhashCode():");
        int hashCode1 = obj1.hashCode();
        int hashCode2 = obj2.hashCode();
        System.out.println("HashCode of obj1: " + hashCode1);
        System.out.println("HashCode of obj2: " + hashCode2);

        // getClass()
        System.out.println("\ngetClass():");
        Class<?> obj1Class = obj1.getClass();
        System.out.println("Class of obj1: " + obj1Class.getName());

        
        // finalize()
        System.out.println("\nfinalize():");
        Object obj3 = null;
        try {
            obj3 = new Object();
        } finally {
            obj3 = null;
            System.gc(); // Requesting garbage collection
        }
    }
}
