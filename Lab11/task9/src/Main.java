import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Nurbek", 4.0),
                new Student("Nigga", 3.5),
                new Student("Brigi", 2.9)
        ));
        System.out.println("Gpa descending ----");
        students.sort((a,b) -> Double.compare(b.gpa, a.gpa));
        students.forEach(System.out::println);
        System.out.println(" Name ----");
        students.sort((a,b) -> a.name.compareTo(b.name));
        students.forEach(System.out::println);

//        Gpa descending then name alphabetically
        System.out.println("Gpa descending than name tierbreak ---");
        students.sort(
                Comparator.comparingDouble((Student s) -> s.gpa)
                        .reversed()
                        .thenComparing((Student s) -> s.name)
        );
        students.forEach(System.out::println);
    }
}
class Student{
    String name;
    double gpa;
    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Name : " + name + ", Gpa : " + gpa;
    }
}