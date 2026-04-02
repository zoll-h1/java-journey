import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        printer.print("Java is not fun");
    }
}
interface Printer{
    void print(String message);
}