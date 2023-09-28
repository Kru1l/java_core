package demos.demo_1;

public class Main {

    public static void main(String[] args) {
        Passport passport = new Passport("KCJN544T", "04055154");

        User user = new User(5, "Jonathon", "KCJN544T", "04055154");

        Client client = new Client("sfv3@erf", "reyyh643", passport);

        System.out.println(user);
        System.out.println(client);

    }
}
