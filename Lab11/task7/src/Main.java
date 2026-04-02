import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Length -----");
        Function<String, Integer> getLength = s -> s.length();
        System.out.println(getLength.apply("hello"));
        System.out.println("----- IntToStar -----");
        Function<Integer, String> intToStart = n -> "*".repeat(n);
        Function<String, String> lengthToStar = getLength.andThen(intToStart);
        System.out.println(lengthToStar.apply("hello"));
    }
}