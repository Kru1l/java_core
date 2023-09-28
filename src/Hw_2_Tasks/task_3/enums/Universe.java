package Hw_2_Tasks.task_3.enums;

public enum Universe {
    MARVEL("Iron Man"), DC("Batman");

    private final String token;

    Universe(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Universe{" +
                "token='" + token + '\'' +
                "} " + super.toString();
    }
}
