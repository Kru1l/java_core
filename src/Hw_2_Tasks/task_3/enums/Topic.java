package Hw_2_Tasks.task_3.enums;

public enum Topic {
    BUSINESS("Hot"), DISCOVERING("Best"), SCIENCE("Fest");

    private final String token;

    Topic(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "Topic(" +
                "token='" + token + '\'' +
                ") " + super.toString();
    }
}
