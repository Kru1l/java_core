package Hw_2_Tasks.task_1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private int id;
    private String name;

    private Address address;
    private Company company;

    public User(int id, String name, Address address, Company company) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.company = company;
    }

    public User(int id, String name, String city, String street, String compName, String catchPhrase) {
        this.id = id;
        this.name = name;
        this.address = new Address(city, street);
        this.company = new Company(compName, catchPhrase);
    }
}
