package chapter9.p2;

import chapter9.p1.Protection;

class OtherPackage {
    OtherPackage() {
        chapter9.p1.Protection p = new chapter9.p1.Protection();
        System.out.println("кoнcтpyктop из другого пакета");
        System.out.println("n_pub = " + p.n_pub);
    }
}
