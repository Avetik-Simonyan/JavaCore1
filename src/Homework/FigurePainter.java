package Homework;
// Կոդ՝ որը պատկերում է այս եռանկյունին.
//*
//* *
//* * *
//* * * *

//public class FigurePainter {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//// Կոդ՝ որը պատկերում է այս եռանկյունին.
////      *
////    * *
////  * * *
////* * * *
//
//public class FigurePainter {
//    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//            for (int j = 4; j > i; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//    }
//}
//
//// Կոդ՝ որը պատկերում է այս եռանկյունին.
//// * * * *
//// * * *
//// * *
//// *
//
//public class FigurePainter {
//    public static void main(String[] args) {
//        for(int i = 0; i < 4; i++) {
//            for(int j = 4; j > i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//    }
//}
//
//// Կոդ՝ որը պատկերում է այս եռանկյունին.
//// * * * *
////   * * *
////     * *
////       *
//public class FigurePainter {
//    public static void main(String[] args) {
//        for (int i = 4; i >= 1; i--) {
//            for (int j = 4; j >= i; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println(" ");
//        }
//    }
//}

//Կոդ՝ որը պատկերում է այս պատկերը՝
//    *
//   * *
//  * * *
// * * * *
//  * * *
//   * *
//    *
public class FigurePainter {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}