package Homework.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        System.out.println(dy.isEmpty());
        dy.add(5);
        System.out.println(dy.isEmpty());

        int[] numbers = {33, 44, 55};

        dy.add(numbers);

        dy.print();

        dy.add(66, 2);

        dy.print();

        System.out.println(dy.isExists(66));
    }
}
//        dy.add(33);
//        dy.add(43);
//        dy.add(53);
//        dy.add(63);
//        dy.add(73);
//        dy.add(83);
//
//        dy.add(83);
//        dy.add(83);
//        dy.add(83);
//        dy.add(83);
//        dy.add(83);
//        dy.add(83);


//        for(int i = 0; i < 10; i++){
//            dy.add(i + 1);
//        }
//
//        dy.print();
//
//        dy.delete(9);

//        dy.print();
//
////        System.out.println(dy.getByIndex(1003));
////        dy.print();
//    }
//}
