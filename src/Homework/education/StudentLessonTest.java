package Homework.education;

import java.util.Scanner;

public class StudentLessonTest {
    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    public static void printCommands() {
        System.out.println("\u001B[34m" + "Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for add lesson");
        System.out.println("Please input " + ADD_STUDENT + " for add student");
        System.out.println("Please input " + PRINT_STUDENTS + " for print students");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println("Please input " + PRINT_LESSONS + " for print lessons");
        System.out.println("Please input " + DELETE_LESSON_BY_NAME + " for delete lessons by name");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for delete students by email" + "\u001B[0m");
    }

    public static void main(String[] args) {
        studentStorage.add(new Student("poxos", "poxosyan", 23, "poxos@mail.ru", "099000000",
                new Lesson("java", 12, "mr poxos", 10000)));
        studentStorage.add(new Student("petros", "petrosyan", 25, "petros@mail.ru", "099111111",
                new Lesson("c++", 6, "mr petros", 15000)));
        lessonStorage.add(new Lesson("java", 12, "mr poxos", 10000));
        lessonStorage.add(new Lesson("c++", 6, "mr petros", 15000));

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addlesson();
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
                    deleteLessonsByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void deleteStudentByEmail() {
        System.out.println("Please input student email");
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

    private static void printStudent() {
        studentStorage.print();
    }

    private static void deleteLessonsByName() {
        System.out.println("Please input Lesson name");
        printLessonsList();
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            lessonStorage.deleteName(name);
        } else
            System.err.println("There are no Lesson");
    }

    private static void printLessonsList() {
        System.out.println("--------");
        lessonStorage.print();
        System.out.println("--------");
    }

    private static void printLessons() {
        lessonStorage.print();
    }

    private static void printStudentsByLesson() {
        System.out.println("Please input Lesson name");
        printLessonsList();
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            studentStorage.printStudents(lesson);
        } else
            System.err.println("There are no students");
    }

    private static void addStudent() {
        System.out.println("Please input Student email");
        String email = scanner.nextLine();
        Student student1 = studentStorage.getByemail(email);
        if (student1 == null) {
            System.out.println("Please input student name");
            String name = scanner.nextLine();
            System.out.println("Please input student surname");
            String surname = scanner.nextLine();
            System.out.println("Please input student age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input student phone");
            String phone = scanner.nextLine();
            printLessonsList();
            System.out.println("Please input student lesson");
            String lessons = scanner.nextLine();
            Lesson lesson = lessonStorage.getByName(lessons);
            Student student = new Student(name, surname, age, email, phone, lesson);
            studentStorage.add(student);
            System.out.println("Thank you, student was added");
        } else
            System.err.println(email + "  the student is available");

//        System.out.println("please input student's name, surname, age, email, phone, lesson");
//        String studentDataStr = scanner.nextLine();
//        String lessons = scanner.nextLine();
//        String[] studentData = studentDataStr.split(",");
//        printLessonsList();
//        if (studentData.length == 6) {
//            int age = Integer.parseInt(studentData[4]);
//            Lesson lesson = lessonStorage.getByName(lessons);
//            Student student = new Student(studentData[0], studentData[1], age, studentData[2], studentData[3], lesson);
//
//            if (studentStorage.getByemail(student.getEmail()) != null) {
//                System.err.println("Invalid email. Student with this email already exists");
//            } else {
//                studentStorage.add(student);
//                System.out.println("Thank you, student was added");
//            }
//        } else {
//            System.err.println("invalid data");
//       }
    }

    private static void addlesson() {
        System.out.println("Please input lesson name ");
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
