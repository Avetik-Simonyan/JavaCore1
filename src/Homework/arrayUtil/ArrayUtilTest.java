package Homework.arrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {2, 5, 7, 9, 10};
        arrayUtil.print(array);
        int[] array2 = {2, 55, 8, 12, 10};
        arrayUtil.print(array2);
        int arrayMax = arrayUtil.max(array);
        int array2Max = arrayUtil.max(array2);

        if (arrayMax > array2Max) {
            System.out.println("Մեծ թիվը array-ի մեջն է: " + arrayMax);
        } else {
            System.out.println("Մեծ թիվը array2-ի մեջն է: " + array2Max);
        }
    }
}
