package demos.demo_4;

import lombok.Data;

@Data
public abstract class Animal {
    private boolean isSmart;

    public abstract void sound();
}
