package Hw2_Tasks.task_2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Trumpet implements Instrument {
    private double diameter;
    @Override
    public void play() {
        System.out.println("Звучить труба, її діаметр " + diameter + "см.");
    }
}
