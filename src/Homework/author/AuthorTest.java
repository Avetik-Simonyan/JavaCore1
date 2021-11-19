package Homework.author;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class AuthorTest {

    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();

    static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String SEARCH_AUTHOR = "2";
    private static final String SEARCH_AUTHOR_BY_AGE = "3";
    private static final String PRINT_AUTHOR = "4";
    private static final String ADD_BOOK = "5";
    private static final String PRINT_BOOKS = "6";
    private static final String SEARCH_BOOKS_BY_TITLE = "7";

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
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    SearchBooksByTitle();
                    break;

                default:
                    System.out.println("Invalid command!!!");
            }
        }
    }

    private static void addBook() {
        System.out.println("please input book's name");
        String title = scanner.nextLine();
        System.out.println("please input book's description");
        String description = scanner.nextLine();
        System.out.println("please input book's price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("please input count of books");
        int count = Integer.parseInt(scanner.nextLine());

        Book book = new Book(title, description, price, count);
        bookStorage.add(book);
        System.out.println("Thank you, book was added");
    }

    private static void SearchBooksByTitle() {
        System.out.println("please input book's info");
        String keyword = scanner.nextLine();
        bookStorage.searchBookByTitle(keyword);
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
        System.out.println("please input " + SEARCH_AUTHOR_BY_AGE + " for search author by age");
        System.out.println("please input " + PRINT_AUTHOR + " for print authors");
        System.out.println("please input " + ADD_BOOK + " for add books");
        System.out.println("please input " + PRINT_BOOKS + " for print books");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for search book by title");
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
