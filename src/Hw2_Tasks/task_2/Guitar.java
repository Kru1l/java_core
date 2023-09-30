package Hw2_Tasks.task_2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Guitar implements Instrument {
    private int stringsAmount;
    public void play() {
        System.out.println("Звучить гітара, в неї " + stringsAmount + " струн.");
    }
}
