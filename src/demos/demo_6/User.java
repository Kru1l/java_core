package demos.demo_6;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private int id;
    private String name;

//    public static class Builder {
//        private User user = new User();
//
//        public Builder id(int id) {
//            this.user.id = id;
//            return this;
//        }
//
//        public Builder name(String name) {
//            this.user.name = name;
//            return this;
//        }
//
//        public User build() {
//            return user;
//        }
//
//    }
//        public static Builder builder() {
//            return new Builder();
//        }
}
