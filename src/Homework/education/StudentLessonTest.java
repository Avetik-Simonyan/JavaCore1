package Homework.education;

import Homework.education.model.Lesson;
import Homework.education.model.Student;
import Homework.education.model.User;
import Homework.education.storage.LessonStorage;
import Homework.education.storage.StudentStorage;
import Homework.education.storage.UserStorage;
import Homework.education.util.DateUtil;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;

import static Homework.education.UserCommands.LOGIN;
import static Homework.education.UserCommands.REGISTER;

public class StudentLessonTest implements StudentLessonCommands {

    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();
    static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) throws ParseException {
        Lesson lesson = new Lesson("Java", 8, "Poxos", 20000);
        Lesson lesson1 = new Lesson("Web", 7, "Petros", 25000);
        Lesson[] lessons = {lesson, lesson1};

        studentStorage.add(new Student("poxos", "poxosyan", 23, "poxos@mail.ru", "099000000",
                lessons, DateUtil.stringToDate("10/01/1991")));
        studentStorage.add(new Student("petros", "petrosyan", 25, "petros@mail.ru", "099111111",
                lessons, DateUtil.stringToDate("01/02/1994")));

        lessonStorage.add(new Lesson("java", 12, "mr poxos", 10000));
        lessonStorage.add(new Lesson("c++", 6, "mr petros", 15000));

        userStorage.add(new User("Avetik", "Simonyan", "avosimonyan@mail.ru",
                "123456", "admin"));
        userStorage.add(new User("Mxitar", "Simonyan", "mxo@mail.ru", "000000", "user"));

        boolean b = true;
        while (b) {
            UserCommands.printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    b = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.err.println("Invalid command!");
            }
        }
    }

    private static void register() {
        System.out.println(" please input email");
        String email = scanner.nextLine();
        User users = userStorage.getByemail(email);
        if (users == null) {
            System.out.println("please input password");
            String password = scanner.nextLine();
            System.out.println("please input name");
            String name = scanner.nextLine();
            System.out.println("please input surname");
            String surname = scanner.nextLine();
            System.out.println("please input type ADMIN or USER )");
            String type = scanner.nextLine();
            if (type.equals("admin") || type.equals("user")) {
                User user = new User(name, surname, email, password, type);
                userStorage.add(user);
                System.out.println("Thank you, Users was added");
            } else System.out.println("invalid type!!!");
            return;
        } else {
            System.err.println("Email does not exists ");
        }
    }

    private static void login() throws ParseException {
        System.out.println("please input email");
        String email = scanner.nextLine();
        System.out.println("please input password");
        String password = scanner.nextLine();
        String type = userStorage.emailPassword(email, password);
        if (type != null) {
            if (type.equals("admin")) {
                adminCommands();
            } else {
                userCommands();
            }
        }
    }

    private static void userCommands() throws ParseException {
        boolean isRun = true;
        while (isRun) {
            StudentLessonCommands.printUserCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    printStudent();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    printLessons();
                    break;
                default:
                    System.err.println("Invalid command!");
            }
        }
    }

    private static void adminCommands() throws ParseException {
        boolean isRun = true;
        while (isRun) {
            StudentLessonCommands.printAdminCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    printStudent();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    printLessons();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.err.println("Invalid command!");
            }
        }
    }

    private static void deleteStudentByEmail() {
        System.out.println("please input student email");
        printStudentList();
        String email = scanner.nextLine();
        Student student = studentStorage.getByemail(email);
        if (student != null) {
            studentStorage.deleteStudent(email);
        } else
            System.err.println("There are no Student email");
    }

    private static void printStudentList() {
        System.out.println("--------");
        printStudent();
        System.out.println("--------");
    }

    private static void deleteLessonByName() {
        System.out.println("please input Lesson name");
        printLessonsList();
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            lessonStorage.deleteName(name);
        } else
            System.err.println("There are no Lesson");
    }

    private static void printLessons() {
        lessonStorage.print();
    }

    private static void printStudentsByLesson() {
        System.out.println("please input Lesson name");
        printLessonsList();
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            studentStorage.printStudents(lesson);
        } else
            System.err.println("There are no students");
    }

    private static void printStudent() {
        studentStorage.print();
    }

    private static void addStudent() throws ParseException {
        System.out.println("please input Student email");
        String email = scanner.nextLine();
        Student students = studentStorage.getByemail(email);
        if (students == null) {
            System.out.println("please input Student name");
            String name = scanner.nextLine();
            System.out.println("please input Student surname");
            String surname = scanner.nextLine();
            System.out.println("please input Student age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("please input Student phone");
            String phone = scanner.nextLine();
            System.out.println("please input Student birth[12/01/2021]");
            String birth = scanner.nextLine();
            Date date = DateUtil.stringToDate(birth);
            printLessonsList();
            System.out.println("please input Student lessons  (___, ___, ___,)");
            String lessons = scanner.nextLine();
            String[] lessonName = lessons.split(",");
            Lesson[] lesson = new Lesson[lessonName.length];
            for (int i = 0; i < lessonName.length; i++) {
                if (lessonStorage.getByName(lessonName[i]) != null) {
                    lesson[i] = lessonStorage.getByName(lessonName[i]);
                }
            }
            if (lesson != null) {
                Student student = new Student(name, surname, age, email, phone, lesson, date);
                studentStorage.add(student);
                System.out.println("Thank you, Student was added");
            } else
                System.err.println("Lesson does not exists");
        } else
            System.err.println(email + "the student is available");
    }

    private static void printLessonsList() {
        System.out.println("--------");
        lessonStorage.print();
        System.out.println("--------");
    }

    private static void addLesson() {
        System.out.println("Please input lesson name");
        String name = scanner.nextLine();
        Lesson lesson1 = lessonStorage.getByName(name);
        if (lesson1 == null) {
            System.out.println("Please input lesson duration");
            int duration = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input lesson lecturer name");
            String lecturerName = scanner.nextLine();
            System.out.println("Please input lesson price");
            int price = Integer.parseInt(scanner.nextLine());
            Lesson lesson = new Lesson(name, duration, lecturerName, price);
            lessonStorage.add(lesson);
            System.out.println("Thank you, lessons was added");
        } else
            System.err.println(name + " lesson is available");
    }
}

