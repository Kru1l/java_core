package demos.demo_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User user = new User(5, "Jim");
//        System.out.println(user);

        SuperUser superUser = new SuperUser(8, "Han", "Java");
//        superUser.hugging();

//        System.out.println(superUser);

        User user1 = new SuperUser();

        superUser.touching();

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(superUser);

        SuperUser user0 = (SuperUser) users.get(1);
        user0.touching();




    }
}
