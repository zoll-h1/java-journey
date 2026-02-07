import java.util.Random;

public class COIN_SIMULATION {
    public static void main(String[] args) {
        Random random = new Random();
        boolean coin = random.nextBoolean();

        if(coin) {
            System.out.println("HEADS");
        }else {
            System.out.println("TAILS");
        }
    }

}
