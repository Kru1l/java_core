package demos.demo_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Role role = Role.MANAGER;
        User user = new User("John", Role.ADMIN);

//        System.out.println(user.getRole().getToken());
//        System.out.println(user.getRole().getToken());
        Helper helper = new Helper();
        String extractedToken = helper.extractToken(user);

        System.out.println(extractedToken);

//        Role[] values = Role.values();
//        System.out.println(Arrays.toString(values));

    }
}
