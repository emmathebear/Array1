import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(4);
        System.out.println(students);
        students.add(new Student("Gianni", 18));
        students.add(new Student("Maria", 18));
        students.add(new Student("Stefano", 16));
        students.add(new Student("Pina", 16));
        System.out.println(students);
    }
}