// Inheritance Example
class Person {
    String name;
    void display() { System.out.println("Name: " + name); }
}

class StudentChild extends Person {
    int marks;
    void showMarks() { System.out.println("Marks: " + marks); }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        StudentChild s = new StudentChild();
        s.name = "Tejas";
        s.marks = 90;

        s.display();
        s.showMarks();
    }
}
