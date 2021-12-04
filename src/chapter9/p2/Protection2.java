package chapter9.p2;

class Protection2 extends chapter9.p1.Protection {
    Protection2() {
        System.out.println("конструктор, унаследованный из другого пакета");
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
