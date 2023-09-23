package Hw1_Tasks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Book.java
        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book("The Shine", 256, "Fantasy");
        ArrayList<String> book1Authors = book1.getAuthors();
        book1Authors.add("Gen Kook");
        book1Authors.add("Jul Vern");
        books.add(book1);

        Book book2 = new Book("Run, Forest, Run", 421, "Drama");
        ArrayList<String> book2Authors = book2.getAuthors();
        book2Authors.add("Forest Camp");
        book2Authors.add("Tom Hanks");
        books.add(book2);

        Book book3 = new Book("Technology", 316, "Scientific");
        ArrayList<String> book3Authors = book3.getAuthors();
        book3Authors.add("Albert Einstein");
        book3Authors.add("Galileo Galley");
        books.add(book3);

        Book book4 = new Book("The ocean", 800, "Philosophy");
        ArrayList<String> book4Authors = book4.getAuthors();
        book4Authors.add("Sokratis");
        book4Authors.add("Platon");
        books.add(book4);

        Book book5 = new Book("In The Forest", 501, "Adventure");
        ArrayList<String> book5Authors = book5.getAuthors();
        book5Authors.add("Mowgli");
        book5Authors.add("Dance Monkey");
        books.add(book5);

        for (Book book : books) System.out.println(book);

        System.out.println("...");

        // Car.java
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 149.5, 3.2, true));
        cars.add(new Car("Dodge", 170, 4.0, false));
        cars.add(new Car("Ford", 140, 2.5, true));
        cars.add(new Car("KIA", 121.5, 1.8, false));
        cars.add(new Car("Honda", 155, 3.5, false));

        for (Car car : cars) System.out.println(car);

        System.out.println("...");

        // Dog.java
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Bob", 4, "Fox Terrier"));
        dogs.add(new Dog("Topic", 7, "Dvir Terrier"));
        dogs.add(new Dog("Rex", 6, "German Shepherd"));
        dogs.add(new Dog("Arne", 5, "Cane Cors"));
        dogs.add(new Dog("Rey", 2, "Spitz"));

        for (Dog dog : dogs) System.out.println(dog);

        System.out.println("...");

        // Runner.java
        ArrayList<Runner> runners = new ArrayList<>();
        Runner runner1 = new Runner(1, "Usain Bolt", 9.58);
        Runner runner2 = new Runner(2, "Jemima Jelagat", 11.05);
        Runner runner3 = new Runner(3, "Galen Rupp", 9.72);
        Runner runner4 = new Runner(4, "Molly Huddle", 10.12);
        Runner runner5 = new Runner(5, "Meb Keflezighi", 9.6);

        runners.add(runner1);
        runners.add(runner2);
        runners.add(runner3);
        runners.add(runner4);
        runners.add(runner5);

        for (int i = 0; i < runners.size(); i++) {
            System.out.println(runners.get(i));
        }
    }
}