package Homework;

public class FigurePainter2 {
    public static void main(String[] args) {
        int i, j, k = 4;
        for (i = 0; i < k; i++) {
            for (j = 2 * (k - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
