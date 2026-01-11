package Java;
/* 
Methods - is a block of code , 
that performs a certain ,
task and only runs when calles.
*/

public class Methods {
    public static void main(String[] args) {
         greeting("Bro");
         
         int result = square(10);


         System.out.println("Square result is : " + result);
    }
    public static void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static int square(int number) {
        return number * number;
    }
    
}