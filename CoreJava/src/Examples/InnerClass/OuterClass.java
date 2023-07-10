package Examples.InnerClass;

public class OuterClass {
   
	private int outerField = 10;

    public void outerMethod() {
        System.out.println("Outer method");

        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    // Inner class declaration
    public class InnerClass {
        private int innerField = 20;

        public void innerMethod() {
            System.out.println("Inner method");
            System.out.println("Accessing outerField from InnerClass: " + outerField);
            System.out.println("Accessing innerField from InnerClass: " + innerField);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}

