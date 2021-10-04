package chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("X փոքր Y");

        x = x * 2;
        if (x == y) System.out.println("X հիմա հավասար է Y");

        x = x * 2;
        if (x > y) System.out.println("X մեծ է Y");

        if(x == y) System.out.println("ոչ մի բան էլ չի տպի");
    }
}
