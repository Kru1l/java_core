package demos.demo_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        User user = new User();

        ArrayList<Musician> musicians = new ArrayList<>();
        musicians.add(student);
        musicians.add(user);

        Musician musician = new Musician() {
            @Override
            public void play() {
                System.out.println("pi ri ri");
            }
        };

        Musician musician1 = new Musician() {
            @Override
            public void play() {
                System.out.println("Tida dida");
            }
        };

        musician.play();
        musician1.play();

    }
}