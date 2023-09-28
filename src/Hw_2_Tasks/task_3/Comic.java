package Hw_2_Tasks.task_3;

import Hw_2_Tasks.task_3.enums.Topic;
import Hw_2_Tasks.task_3.enums.Universe;

import java.util.ArrayList;

public class Comic extends Book {
    private final Universe universe;

    public Comic(Universe universe) {
        this.universe = universe;
    }

//    public Comic(double weight, double height, int pages, ArrayList<String> authors, Topic topic, Universe universe) {
//        super(weight, height, pages, authors, topic);
//        this.universe = universe;
//    }

    public Universe getUniverse() {
        return universe;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "universe=" + universe +
                "} " + super.toString();
    }
}
