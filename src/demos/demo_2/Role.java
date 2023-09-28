package demos.demo_2;

public enum Role {
    MANAGER("full"), ADMIN("not"), SUPERVISER;
    private String token;

    Role() {
    }

    Role(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "Role(" +
                "token='" + token + '\'' +
                ')';
    }
}