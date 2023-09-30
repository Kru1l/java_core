package demos.demo_4;

public class Main {
    public static void main(String[] args) {

//        Calculator calculator = new Calculator() {
//            @Override
//            public int calculate(int a, int b) {
//                return a - b;
//            }
//        };
//        calculator.calculate(5, 4);

//        Calculator calculator = (a, b) -> a + b;
        Calculator calculator = Integer::sum;

        System.out.println(calculator.calculate(45, 100));
        int calculated1 = calculator.calculate(65, 12);
        System.out.println(calculated1);

        Calculator calculator1 = (a, b) -> {
            System.out.println(a / b);
            return a / b;
        };
        calculator1.calculate(455640, 784);
    }
}
