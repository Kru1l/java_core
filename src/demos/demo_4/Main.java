package demos.demo_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Shark shark = new Shark();
        Lion lion = new Lion();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(shark);
        animals.add(lion);


        Shark sharkAn = (Shark) animals.get(0);
        sharkAn.swim();

        Lion lionAn = (Lion) animals.get(1);
        lionAn.run();
        lionAn.sound();
        sharkAn.sound();
    }
}
