package demos.demo_3;

public interface First {
    /*public static final*/ int x = 0;

    /*public*/ int doSomething(int x);

    default void dance() {
        System.out.println("Hip-Hop!");
    }

    static void sing() {
        System.out.println("Laaaa");
    }
}