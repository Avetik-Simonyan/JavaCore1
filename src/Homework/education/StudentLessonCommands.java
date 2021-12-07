package Homework.education;

public interface StudentLessonCommands {
    String EXIT = "0";
    String ADD_LESSON = "1";
    String ADD_STUDENT = "2";
    String PRINT_STUDENTS = "3";
    String PRINT_STUDENTS_BY_LESSON = "4";
    String PRINT_LESSONS = "5";
    String DELETE_LESSON_BY_NAME = "6";
    String DELETE_STUDENT_BY_EMAIL = "7";

    static void printUserCommands() {
        System.out.println("\u001B[34m" + "Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for add lesson");
        System.out.println("Please input " + ADD_STUDENT + " for add student");
        System.out.println("Please input " + PRINT_STUDENTS + " for print students");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println("Please input " + PRINT_LESSONS + " for print lessons");
        System.out.println("Please input " + DELETE_LESSON_BY_NAME + " for delete lessons by name");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for delete students by email" + "\u001B[0m");
    }

    static void printAdminCommands() {
        System.out.println("\u001B[34m" + "please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " ADD_LESSON");
        System.out.println("please input " + ADD_STUDENT + " ADD_STUDENT");
        System.out.println("please input " + PRINT_STUDENTS + " PRINT_STUDENTS");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " PRINT_STUDENTS_BY_LESSON");
        System.out.println("please input " + PRINT_LESSONS + " PRINT_LESSONS");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " DELETE_LESSON_BY_NAME");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " DELETE_STUDENT_BY_EMAIL" + "\u001B[0m");
    }
}
