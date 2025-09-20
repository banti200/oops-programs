
// Class & Object Example
class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();   // Object
        s1.name = "Tejas";
        s1.marks = 90;
        s1.display();
    }
}
