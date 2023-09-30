package Hw2_Tasks.task_2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drum implements Instrument {
    private String size;
    @Override
    public void play() {
        System.out.println("Звучить барабан, його розмір: " + size + "см.");
    }
}
