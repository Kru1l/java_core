package demos.demo_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String  name;

    private Passport passport;

    public User(int id, String name, String series, String number) {
        this.id = id;
        this.name = name;
        this.passport = new Passport(series, number);
    }
}
