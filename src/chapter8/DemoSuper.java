package chapter8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 1);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(2, 3);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен:" + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен" + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Oбъeм mybox3 равен" + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Oбъeм myclone равен " + vol);
        System.out.println("Вес myclone равен" + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();
    }
}
