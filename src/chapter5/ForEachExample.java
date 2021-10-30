package chapter5;

public class ForEachExample {
    public static void main(String[] args) {
        int [] array = {1, 6, 4, 55, 64, 23};
        int x = 4;
        for (int a : array) {
            if (a == x) {
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }
}
