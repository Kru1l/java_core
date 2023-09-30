package demos.demo_3;

public class Main {
    public static void main(String[] args) {
        First first = new First() {
            @Override
            public int doSomething(int x) {
                return 0;
            }
        };

        first.dance();

        Son son = new Son();
        System.out.println(son.doSomething(5));
        son.dance();

        First.sing();
    }
}
