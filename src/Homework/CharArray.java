package Homework;

public class CharArray {

    public static void main(String[] args) {

        char[] charArray = {'b', 'o', 'l', 'o', 'l', 'a'};
        int count = 0;
        char c = 'o';
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                count++;
            }
        }
        System.out.println("conut of '" + c + "' = " + count);

        System.out.println(charArray[charArray.length / 2]);
        System.out.println(charArray[charArray.length / 2 + 1]);

        if (charArray[charArray.length - 2] == 'l' &&
                charArray[charArray.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        boolean isBob = false;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == 'b' && charArray[i + 2] == 'b') {
                isBob = true;
                break;
            }
        }
        System.out.println(isBob);
    }
}

