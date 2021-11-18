package Homework.author;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class AuthorTest {

    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String SEARCH_AUTHOR = "2";
    private static final String SEARCH_AUTHOR_BY_AGE = "3";
    private static final String PRINT_AUTHOR = "4";

    public static void main(String[] args) {
        authorStorage.add(new Author("poxos", "poxosyan", 25, "poxos@mail.ru", "male"));
        authorStorage.add(new Author("poxosuhi", "poxosyan", 23, "poxosuhi@mail.ru", "female"));
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case SEARCH_AUTHOR:
                    searchByName();
                    break;
                case SEARCH_AUTHOR_BY_AGE:
                    searchByAge();
                    break;
                case PRINT_AUTHOR:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("Invalid command!!!");
            }
        }
    }

    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + SEARCH_AUTHOR + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHOR_BY_AGE + " for search author by name");
        System.out.println("please input " + PRINT_AUTHOR + " for print authors");
    }

    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void addAuthor() {
        System.out.println("please input author's name");
        String name = scanner.nextLine();
        System.out.println("please input author's surname");
        String surname = scanner.nextLine();
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        System.out.println("please input author's gender");
        String gender = scanner.nextLine();
        System.out.println("please input author's age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, age, email, gender);
        authorStorage.add(author);
        System.out.println("Thank you, author was added");
    }
}
