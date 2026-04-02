public class Main {
    public static void main(String[] args) {
        Printer p = message -> System.out.println(message);
            p.print("NIgga");
    }

}
interface Printer {
    void print(String message);
}