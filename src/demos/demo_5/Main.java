package demos.demo_5;

public class Main {
    public static void main(String[] args) {

//        Wrap wrap = new Wrap(10);
//
//        Wrap.AddOperations addOperations = wrap.new AddOperations();
//
//        addOperations.addOne();
//        addOperations.addTwo();
//
//        Wrap.RemoveOperations removeOperations = wrap.new RemoveOperations();
//
//        removeOperations.removeTwo();
//
//        System.out.println(wrap.getX());

        Wrap.AddOperations addOperations = new Wrap.AddOperations();
        addOperations.addTwo();

        System.out.println(Wrap.x);

        Wrap.RemoveOperations removeOperations = new Wrap.RemoveOperations();
        removeOperations.removeOne();
        System.out.println(Wrap.x);

    }
}
