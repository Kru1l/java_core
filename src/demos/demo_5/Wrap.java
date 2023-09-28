package demos.demo_5;

public class Wrap {
    static int x;

    public Wrap() {
    }

    static class AddOperations {
        public void addOne() {
            x++;
        }

        public void addTwo() {
            x = x + 2;
        }
    }

    static class RemoveOperations {
        public void removeOne() {
            x--;
        }

        public void removeTwo() {
            x = x - 2;
        }
    }

//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }

    @Override
    public String toString() {
        return "Wrap{" +
                "x=" + x +
                '}';
    }
}
