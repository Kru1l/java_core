package Hw_2_Tasks.task_3;

import Hw_2_Tasks.task_3.enums.Topic;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class Book extends Papyrus {
    private int pages;
    private ArrayList<String> authors = new ArrayList<>();
    private Topic topic;

    public Book(double weight, double height, int pages, ArrayList<String> authors, Topic topic) {
        super(weight, height);
        this.pages = pages;
        this.authors = authors;
        this.topic = topic;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Book(" +
                "pages=" + pages +
                ", authors=" + authors +
                ", topic=" + topic +
                ") " + super.toString();
    }
}