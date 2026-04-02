import java.util.Locale;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> isUpper = s -> System.out.println(s.toUpperCase());
        System.out.println("----- Is Upper -----");
        isUpper.accept("nigga");
        System.out.println("----- Length -----");
        Consumer<String> length = s -> System.out.println("Length: " + s.length());
        length.accept("nigga");
        Consumer<String> both = isUpper.andThen(length);
        System.out.println("----- Both -----");
        both.accept("nigga");
    }
}