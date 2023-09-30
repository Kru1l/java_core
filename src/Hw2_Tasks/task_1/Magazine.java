package Hw2_Tasks.task_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Magazine implements Printable {
    private String topic;
    private int pages;

    @Override
    public void print() {
        System.out.println("Magazine!");
    }
}