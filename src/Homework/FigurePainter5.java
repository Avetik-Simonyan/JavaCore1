package Homework;

public class FigurePainter5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int k = 4;
        for (int i = k - 1; i >= 0; i--) {
            for (int j = k; j >= i + 1; j--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(" *");
            }
            System.out.println("");
        }

    }
}
