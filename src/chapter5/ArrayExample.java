package chapter5;

public class ArrayExample {

    public static void main(String[] args) {
        int[] array = {3, 10, 6, 9, 10, 54, 56, 87, 44, 63};
        int n = 44;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                index = i;
            }
        }
        System.out.println(index);
        }
    }
