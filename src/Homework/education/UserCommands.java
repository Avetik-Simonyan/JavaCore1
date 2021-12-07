package Homework.education;

public interface UserCommands {
    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";

    static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + LOGIN + " LOGIN");
        System.out.println("please input " + REGISTER + " REGISTER");
    }
}
