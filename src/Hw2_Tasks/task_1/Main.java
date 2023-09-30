package Hw2_Tasks.task_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book("Human System", 342));
        printables.add(new Magazine("Business", 35));
        printables.add(new Book("Emotional Intellect", 411));
        printables.add(new Magazine("Traveling", 47));

        Book book = (Book) printables.get(2);
        System.out.println(book);

        book.print();
        System.out.println(book.sqrtPages(book.getPages()));

        book.readBook();
    }
}