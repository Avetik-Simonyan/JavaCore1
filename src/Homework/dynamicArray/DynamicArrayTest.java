package Homework.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
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
        for(int i = 0; i < 1000; i++){
            dy.add(i + 1);
        }

        System.out.println(dy.getByIndex(1003));
        dy.print();
    }
}
