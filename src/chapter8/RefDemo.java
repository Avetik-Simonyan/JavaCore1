package chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weight = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box();
        double vol;

        vol = weight.volume();
        System.out.println("Oбъeм weightbox равен: " + vol);
        System.out.println("Bec weightbox равен: " + weight.weight);
        System.out.println();

        plainbox = weight;
        vol = plainbox.volume();
        System.out.println("Oбъeм plainbox равен: " + vol);
    }
}
