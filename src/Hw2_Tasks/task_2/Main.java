package Hw2_Tasks.task_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar(6));
        instruments.add(new Drum("25x70"));
        instruments.add(new Trumpet(32.5));

        for (Instrument instr : instruments) instr.play();
    }
}