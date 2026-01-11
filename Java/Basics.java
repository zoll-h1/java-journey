package Java;
public class Basics {
    public static void main(String[] args) {
    // ====== PRIMITIVE ======
    int age = 18;  // Integer

    double height = 1.75; // Float
    
    char grade = 'A'; // Character ( notice ; ' ')

    boolean isSmart = true; // true/false
    
    // ===== NON-PRIMITIVE =======
    String name = "Nurbek";

    System.out.println("Name : " + name);

    System.out.println("Age : " + age);
    
    System.out.println("My grade is : " + grade + " \nand am I smart ? : " + isSmart );

    System.out.println("My height : " + height);

    // MATH 
    int nextAge = age + 1;
    System.out.println("Next Year : " + nextAge);    

    }
}