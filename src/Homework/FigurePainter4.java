package Homework;

public class FigurePainter4 {
    public static void main(String[] args) {
        int i, j, k = 4;
        for (i = k; i >= 1; i--) {
            for (j = k; j >= i; j--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
