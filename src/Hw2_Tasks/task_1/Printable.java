package Hw2_Tasks.task_1;

public interface Printable {
    void print();

    default String sqrtPages(int pages) {
        return "Корінь квадратний від сторінок це " + Math.sqrt(pages);
    }
}