package demos.demo_6;

public class Main {
    public static void main(String[] args) {

        User john = User.builder().id(5).name("John").build();
        System.out.println(john);

    }
}
