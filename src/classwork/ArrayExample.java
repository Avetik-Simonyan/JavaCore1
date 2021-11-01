package classwork;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {3, 6, 7, 6, 5, 4, 23, 54, 21, 3};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    System.out.println(array[i] + "-ը կրկնվում է");
//                    break;
//                }
//
//            }
//
//        }
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result = false;
                break;
            }
        }
        System.out.println(result);

    }
}
