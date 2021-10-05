package chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;

        System.out.println("b հավասար է " + b);

        b = true;

        System.out.println("b հավասար է " + b);

        if(b) System.out.println("կոդը կատարվում է");

        b = false;

        if (b) System.out.println("Կոդը չի կատարվում");
    }
}
