public class Main {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override
            public void sayNigga() {
                System.out.println("Nigga!!");
            }
        };
        g.sayNigga();
    }
}
interface Greeting {
    void sayNigga();
}