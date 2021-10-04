package chapter2;

public class Example_in_class {
    public static void main(String[] args) {
        int a, a2;
        a = 5;
        a2 = a;
        a = a * 2;
        System.out.println("a=" + a);

        System.out.println("a2=" + a2);

        if (a >= a2) {
            System.out.println("a մեծ կամ հավասար է a2");

        }


        for (int i = 0; i < 10; i++) {
            System.out.println("kuku" + i);
        }
    }

}
