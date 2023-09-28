package Hw_2_Tasks.task_3;

import Hw_2_Tasks.task_3.enums.Topic;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class Magazine extends Book {

    private String difficulty;

    public Magazine(String difficulty) {
        this.difficulty = difficulty;
    }

    public Magazine(double weight, double height, int pages, ArrayList<String> authors, Topic topic, String difficulty) {
        super(weight, height, pages, authors, topic);
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "difficulty='" + difficulty + '\'' +
                "} " + super.toString();
    }
}