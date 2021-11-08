package chapter6;

public class Box {
    double widht;
    double height;
    double depth;

//    void volume() {
//        System.out.print("volume: ");
//        System.out.println(widht * height * depth);
//
//    }

//    double volume() {
//        return widht * height * depth;
//    }
//    void setDim(double w, double h, double d) {
//        widht = w;
//        height = h;
//        depth = d;
//    }

    Box(){
        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        widht = 10;
        height = 10;
        depth = 10;
    }
    double volume() {
        return widht * height * depth;
    }
}
