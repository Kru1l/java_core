package demos.demo_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Passport {
    private String series;
    private String number;
}
