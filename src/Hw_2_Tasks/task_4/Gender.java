package Hw_2_Tasks.task_4;

public enum Gender {
    MALE("power"), FEMALE("beauty");

    private final String token;

    Gender(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "Gender(" +
                "token='" + token + '\'' +
                ") " + super.toString();
    }
}
