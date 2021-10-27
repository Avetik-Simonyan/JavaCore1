package chapter5;

public class IfElseIfExample {
    public static void main(String[] args) {
        String country = "Armenia";
        String language = "";
        if (country.equals("Armenia")) {
            language = "hy";
        }
        else if (country.equals("Russia")) {
            language = "ru";
        }
        else if (country.equals("USA")) {
            language = "us";
        }
        System.out.println("language = " + language);
    }
}
