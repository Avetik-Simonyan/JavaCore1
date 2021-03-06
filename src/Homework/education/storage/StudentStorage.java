package Homework.education.storage;

import Homework.education.model.Lesson;
import Homework.education.model.Student;

public class StudentStorage {
    private Student[] students = new Student[10];
    int size = 0;

    public void add(Student student) {
        if (students.length == size) {
            extand();
        }
        students[size++] = student;
    }

    public void extand() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public Student getByemail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public void printStudents(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(lesson)) {
                System.out.println(students[i]);
            }
        }
    }

    public void deleteStudent(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                for (int j = i + 1; j < size; j++) {
                    students[j - 1] = students[j];
                }
            }
        }
        size--;
    }
}
