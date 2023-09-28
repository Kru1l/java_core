package demos.demo_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    private String login;
    private String password;

    private Passport passport;

    public Client(String login, String password, String series, String number) {
        this.login = login;
        this.password = password;
        this.passport = new Passport(series, number);
    }
}
