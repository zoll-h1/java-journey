import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(3));

        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isPositiveIsEven = isEven.and(isPositive);
        System.out.println(isPositiveIsEven.test(4));
        System.out.println(isPositiveIsEven.test(4));

        Predicate<Integer> isOdd = isEven.negate();
        System.out.println(isOdd.test(5));

    }
}
