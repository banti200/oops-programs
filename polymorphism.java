// Polymorphism Example
class MathOperation {
    // Method Overloading
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

class Parent {
    void show() { System.out.println("Parent class method"); }
}

class Child extends Parent {
    // Method Overriding
    @Override
    void show() { System.out.println("Child class method"); }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        System.out.println("Overloading: " + m.add(5, 10));
        System.out.println("Overloading: " + m.add(3.5, 2.5));

        Parent p = new Child(); // runtime polymorphism
        p.show();
    }
}
