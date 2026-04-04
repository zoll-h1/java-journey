import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Nigga", "Bayastan", "Nigga300", "Bitch"));
        System.out.println("----- Anonymous class -----");
        Collections.sort(names, new Comparator<String>(){
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);   // In Alphabetical Order
                 }
                });
        System.out.println("Alphabetical: (anon) " + names);
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());
            }
        });
        System.out.println("Length: (anon) " + names);
        System.out.println("----- Lambda -----");

        names.sort((a,b) -> a.compareTo(b));
        System.out.println("Alphabetical: (lambda) " + names);

        names.sort((a,b) -> Integer.compare(a.length(), b.length()));
        System.out.println("Length: (lambda) " + names);
    }
}