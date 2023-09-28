package Hw_2_Tasks.task_3;

// Cтворити клас ланцюг наслідування:
//        Папірус-Книга-Журнал
//        Папірус-Книга-Комікс
//        Кількість полів довільна.

import Hw_2_Tasks.task_3.enums.Topic;
import Hw_2_Tasks.task_3.enums.Universe;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Papyrus papyrus = new Papyrus(55,100);
        System.out.println(papyrus);

        ArrayList<String> bookAuthors = new ArrayList<>();
        bookAuthors.add("John Lennon");
        bookAuthors.add("Mike Takashi");
        Book book = new Book(20, 15, 225, bookAuthors, Topic.BUSINESS);

        System.out.println(book);

        ArrayList<String> magazineAuthors = new ArrayList<>();
        magazineAuthors.add("Mali Cyper");

        Magazine magazine = new Magazine(30, 40, 35, magazineAuthors, Topic.DISCOVERING, "Hard");

        Comic comic = new Comic(Universe.MARVEL);
        System.out.println(comic.getUniverse());
        System.out.println(comic);
    }
}