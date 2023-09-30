package demos.demo_5;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

//        Function<Integer, String> intStringFunction = new Function<>() {
//            public String apply(Integer integer) {
//                return integer + "g";
//            }
//        };
//
//        String apply = intStringFunction.apply(10);
//        System.out.println(apply);

//        BiFunction<User, Customer, Admin> biFunction = new BiFunction<>() {
//            public Admin apply(User user, Customer customer) {
//                return new Admin(user.getName(), customer.getPassword());
//            }
//        };

        BiFunction<User, Customer, Admin> biFunction = (user, customer) -> new Admin(user.getName(), customer.getPassword(), customer.getLogin());

//        User user = new User("John");
//        Customer customer = new Customer("koly@r43mail.com", "qwer2343");
//        Admin appAdmin = biFunction.apply(user, customer);

        Admin appAdmin = biFunction.apply(new User("John"),
                new Customer("koly@r43mail.com", "qwer2343"));

        System.out.println(appAdmin);
    }
}