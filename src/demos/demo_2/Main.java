package demos.demo_2;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(45);
        integers.add(26151);
        integers.add(-454);
        integers.add(104840);
        integers.add(1500);
        integers.add(256);
//        System.out.println(integers);

//        ComparatorImpl comparator = new ComparatorImpl();
//        integers.sort(comparator);

//        integers.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });

//        System.out.println(integers);

//        integers.sort((o1, o2) -> o2 - o1);
        integers.sort(Comparator.comparingInt(o -> o));
        System.out.println(integers);


    }
}
