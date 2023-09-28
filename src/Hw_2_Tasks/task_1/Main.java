package Hw_2_Tasks.task_1;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("New York", "st. Franklin 13");
        Company company = new Company("EPAM", "Let's do it!");
        User user = new User(4, "John", address, company);
        System.out.println(user);

        User user1 = new User(3, "Gim", "Lebanon", "st. Goke", "Apple", "Oh, babe");
        System.out.println(user1);
    }
}