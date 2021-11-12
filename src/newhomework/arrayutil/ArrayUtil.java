package newhomework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 6, 8, 15, 23, 65, 1, 45, 6, 10};
//Տպել մասիվի բոլոր էլեմենտները
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
//Տպել մասիվի ամենամեծ թիվը,
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
//Տպել մասիվի ամենափոքրը թիվը,
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);

//Տպել մասիվի բոլոր զույգ էլեմենտները,
        System.out.println("զույգ էլեմենտները`");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
//Տպեք մասիվի բոլոր կենտ էլեմենտները։
        System.out.println("կենտ էլեմենտները`");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
//Տպեք զույգերի քանակը։
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("զույգերի քանակակը հավասար է " + evenCount);

//Տպել կնտերի քանակը
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("կենտերի քանակը հավասար է " + oddCount);

//Տպել մասիվի բոլոր թվերի միջին թվաբանականը
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("avarage = " + sum / array.length);

//Տպեք մասիվի էլեմենտների գումարը
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }
        System.out.println("sum = " + sum1);
    }
}
