public class Main {
    public static void main(String[] args) {
        System.out.println("----------- Anonymous operation----------");

        MathOperation addNigga = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        MathOperation multNigga = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a * b;
            }
        };
        System.out.println(addNigga.operate(4,4));
        System.out.println(multNigga.operate(5,5));


        System.out.println("------------ Lambda using -------------");
        MathOperation lambdaAdd = (a,b) -> a + b;
        MathOperation lambdaMult = (a,b) -> a * b;
        System.out.println(lambdaAdd.operate(5,5));
        System.out.println(lambdaMult.operate(5,5));
    }
}
interface MathOperation {
    int operate(int a , int b);
}