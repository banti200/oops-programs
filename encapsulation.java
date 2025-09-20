// Encapsulation Example
class StudentEncap {
    private String name;
    private int marks;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setMarks(int marks) { this.marks = marks; }
    public int getMarks() { return marks; }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        StudentEncap s1 = new StudentEncap();
        s1.setName("Tejas");
        s1.setMarks(95);

        System.out.println("Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
    }
}
