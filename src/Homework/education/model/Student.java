package Homework.education.model;

import Homework.education.util.DateUtil;

import java.util.Objects;
import java.util.Date;
import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String phone;
    private Lesson[] lesson;
    private Date dateOfBirth;

    public Student(String name, String surname, int age, String email, String phone, Lesson[] lesson, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.lesson = lesson;
        this.dateOfBirth = dateOfBirth;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname() {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        this.phone = phone;
    }

    public Lesson[] getLesson() {
        return lesson;
    }

    public void setLesson(Lesson[] lesson) {
        this.lesson = lesson;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth() {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", lesson=" + Arrays.toString(lesson) +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(email, student.email) && Objects.equals(phone, student.phone) && Arrays.equals(lesson, student.lesson) && Objects.equals(dateOfBirth, student.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, age, email, phone, dateOfBirth);
        result = 31 * result + Arrays.hashCode(lesson);
        return result;
    }
}


