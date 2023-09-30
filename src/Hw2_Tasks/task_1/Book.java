package Hw2_Tasks.task_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements Printable {
    private String title;
    private int pages;

    @Override
    public void print() {
        System.out.println("Book!");
    }

    public void readBook() {
        System.out.println("I'm reading the book!");
    }
}